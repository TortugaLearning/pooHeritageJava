package com.direction.main;

import com.direction.service.Data;
import com.direction.service.Utils;

public class Main {
    public static void main(String[] args) {
        final Data data = new Data();

        data.printTotal();

        Utils.newLine();

        data.printAnneeMoyen();

        Utils.newLine();

        data.printInfos();

    }
}
