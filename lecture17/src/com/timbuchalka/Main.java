package com.timbuchalka;

public class Main {

    public static void main(String[] args) {

        // int has a width of 32
        int myIntMinValue = -2_147_483_648;
        int myIntMaxValue = 2_147_483_647;
        int myIntTotal = (myIntMinValue / 2);
        System.out.println("myIntTotal = " + myIntTotal);

        // byte has a width of 8
        byte myByteMinValue = -128;
        byte myByteMaxValue = 127;
        byte myByteTotal = (byte) (myByteMinValue / 2);
        System.out.println("myByteTotal = " + myByteTotal);

        // short has a width of 16
        short myShortMinValue = -32768;
        short myShortMaxValue = 32767;
        short myShortTotal = (short) (myShortMinValue / 2);
        System.out.println("myShortTotal = " + myShortTotal);

        // long has a width of 64  max = 2^63
        long myLongMinValue = -9_223_372_036_854_775_808L;
        long myLongMaxValue = 9_223_372_036_854_775_807L;
    }
}