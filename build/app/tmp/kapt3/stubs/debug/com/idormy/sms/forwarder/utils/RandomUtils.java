package com.idormy.sms.forwarder.utils;

import java.lang.System;

/**
 * <pre>
 * desc   : Random Utils
 * author : xuexiang
 * time   : 2018/4/28 上午12:41
 * </pre> *
 *
 * Shuffling algorithm
 *  * [.shuffle] Shuffling algorithm, Randomly permutes the specified array using a default source of
 * randomness
 *  * [.shuffle] Shuffling algorithm, Randomly permutes the specified array
 *  * [.shuffle] Shuffling algorithm, Randomly permutes the specified int array using a default source of
 * randomness
 *  * [.shuffle] Shuffling algorithm, Randomly permutes the specified int array
 *
 *
 * get random int
 *  * [.getRandom] get random int between 0 and max
 *  * [.getRandom] get random int between min and max
 *
 *
 * get random numbers or letters
 *  * [.getRandomCapitalLetters] get a fixed-length random string, its a mixture of uppercase letters
 *  * [.getRandomLetters] get a fixed-length random string, its a mixture of uppercase and lowercase letters
 *
 *  * [.getRandomLowerCaseLetters] get a fixed-length random string, its a mixture of lowercase letters
 *  * [.getRandomNumbers] get a fixed-length random string, its a mixture of numbers
 *  * [.getRandomNumbersAndLetters] get a fixed-length random string, its a mixture of uppercase, lowercase
 * letters and numbers
 *  * [.getRandom] get a fixed-length random string, its a mixture of chars in source
 *  * [.getRandom] get a fixed-length random string, its a mixture of chars in sourceChar
 */
@kotlin.Suppress(names = {"MemberVisibilityCanBePrivate", "unused"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/idormy/sms/forwarder/utils/RandomUtils;", "", "()V", "Companion", "app_debug"})
public final class RandomUtils {
    @org.jetbrains.annotations.NotNull
    public static final com.idormy.sms.forwarder.utils.RandomUtils.Companion Companion = null;
    private static final java.lang.String NUMBERS_AND_LETTERS = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final java.lang.String NUMBERS = "0123456789";
    private static final java.lang.String LETTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final java.lang.String CAPITAL_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final java.lang.String LOWER_CASE_LETTERS = "abcdefghijklmnopqrstuvwxyz";
    
    private RandomUtils() {
        super();
    }
    
    /**
     * 在数字和英文字母中获取一个定长的随机字符串
     *
     * @param length 长度
     * @return 随机字符串
     * @see RandomUtils.getRandom
     */
    @org.jetbrains.annotations.Nullable
    @kotlin.jvm.JvmStatic
    public static final java.lang.String getRandomNumbersAndLetters(int length) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0019\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\r\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nJ\u0016\u0010\r\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nJ\u0018\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\nJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\nJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\nJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\nJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\nJ\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\nH\u0007J\u001d\u0010\u0019\u001a\u00020\u001a2\u0010\u0010\u001b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u001c\u00a2\u0006\u0002\u0010\u001dJ\'\u0010\u0019\u001a\u00020\u001a2\u0010\u0010\u001b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u001c2\u0006\u0010\u001e\u001a\u00020\nH\u0002\u00a2\u0006\u0002\u0010\u001fJ\u0012\u0010\u0019\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010 J\u001a\u0010\u0019\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u001e\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\""}, d2 = {"Lcom/idormy/sms/forwarder/utils/RandomUtils$Companion;", "", "()V", "CAPITAL_LETTERS", "", "LETTERS", "LOWER_CASE_LETTERS", "NUMBERS", "NUMBERS_AND_LETTERS", "randomColor", "", "getRandomColor", "()I", "getRandom", "sourceChar", "", "length", "max", "min", "source", "getRandomCapitalLetters", "getRandomLetters", "getRandomLowerCaseLetters", "getRandomNumbers", "getRandomNumbersAndLetters", "shuffle", "", "objArray", "", "([Ljava/lang/Object;)Z", "shuffleCount", "([Ljava/lang/Object;I)Z", "", "intArray", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * 在数字和英文字母中获取一个定长的随机字符串
         *
         * @param length 长度
         * @return 随机字符串
         * @see RandomUtils.getRandom
         */
        @org.jetbrains.annotations.Nullable
        @kotlin.jvm.JvmStatic
        public final java.lang.String getRandomNumbersAndLetters(int length) {
            return null;
        }
        
        /**
         * 在数字中获取一个定长的随机字符串
         *
         * @param length 长度
         * @return 随机数字符串
         * @see RandomUtils.getRandom
         */
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getRandomNumbers(int length) {
            return null;
        }
        
        /**
         * 在英文字母中获取一个定长的随机字符串
         *
         * @param length 长度
         * @return 随机字母字符串
         * @see RandomUtils.getRandom
         */
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getRandomLetters(int length) {
            return null;
        }
        
        /**
         * 在大写英文字母中获取一个定长的随机字符串
         *
         * @param length 长度
         * @return 随机字符串 只包含大写字母
         * @see RandomUtils.getRandom
         */
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getRandomCapitalLetters(int length) {
            return null;
        }
        
        /**
         * 在小写英文字母中获取一个定长的随机字符串
         *
         * @param length 长度
         * @return 随机字符串 只包含小写字母
         * @see RandomUtils.getRandom
         */
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getRandomLowerCaseLetters(int length) {
            return null;
        }
        
        /**
         * 在一个字符数组源中获取一个定长的随机字符串
         *
         * @param source 源字符串
         * @param length 长度
         * @return
         * * if source is null or empty, return null
         * * else see [RandomUtils.getRandom]
         */
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getRandom(@org.jetbrains.annotations.NotNull
        java.lang.String source, int length) {
            return null;
        }
        
        /**
         * 在一个字符数组源中获取一个定长的随机字符串
         *
         * @param sourceChar 字符数组源
         * @param length     长度
         * @return
         * * if sourceChar is null or empty, return null
         * * if length less than 0, return null
         */
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getRandom(@org.jetbrains.annotations.Nullable
        char[] sourceChar, int length) {
            return null;
        }
        
        /**
         * get random int between 0 and max
         *
         * @param max 最大随机数
         * @return
         * * if max <= 0, return 0
         * * else return random int between 0 and max
         */
        public final int getRandom(int max) {
            return 0;
        }
        
        /**
         * get random int between min and max
         *
         * @param min 最小随机数
         * @param max 最大随机数
         * @return
         * * if min > max, return 0
         * * if min == max, return min
         * * else return random int between min and max
         */
        public final int getRandom(int min, int max) {
            return 0;
        }
        
        public final int getRandomColor() {
            return 0;
        }
        
        /**
         * 随机打乱数组中的内容
         *
         * @param objArray
         * @return
         */
        public final boolean shuffle(@org.jetbrains.annotations.Nullable
        java.lang.Object[] objArray) {
            return false;
        }
        
        /**
         * 随机打乱数组中的内容
         *
         * @param objArray
         * @param shuffleCount
         * @return
         */
        private final boolean shuffle(java.lang.Object[] objArray, int shuffleCount) {
            return false;
        }
        
        /**
         * 随机打乱数组中的内容
         *
         * @param intArray
         * @return
         */
        @org.jetbrains.annotations.Nullable
        public final int[] shuffle(@org.jetbrains.annotations.Nullable
        int[] intArray) {
            return null;
        }
        
        /**
         * 随机打乱数组中的内容
         *
         * @param intArray
         * @param shuffleCount
         * @return
         */
        @org.jetbrains.annotations.Nullable
        public final int[] shuffle(@org.jetbrains.annotations.Nullable
        int[] intArray, int shuffleCount) {
            return null;
        }
    }
}