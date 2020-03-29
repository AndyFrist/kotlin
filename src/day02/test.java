package day02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * @author xuxiaopeng
 * @date 2020/3/24 9:36 下午
 * @className: test
 * @description:
 */
public class test {

    private void fild(){
        File file = new File("");
        if (file != null){
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

    }
}
