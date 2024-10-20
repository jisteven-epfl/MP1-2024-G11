package ch.epfl.cs107.crypto;

import ch.epfl.cs107.Helper;

import static ch.epfl.cs107.utils.Text.*;
import static ch.epfl.cs107.utils.Image.*;
import static ch.epfl.cs107.utils.Bit.*;
import static ch.epfl.cs107.stegano.ImageSteganography.*;
import static ch.epfl.cs107.stegano.TextSteganography.*;
import static ch.epfl.cs107.crypto.Encrypt.*;
import static ch.epfl.cs107.crypto.Decrypt.*;
import static ch.epfl.cs107.Main.*;

/**
 * <b>Task 2: </b>Utility class to encrypt a given plain text.
 *
 * @author Hamza REMMAL (hamza.remmal@epfl.ch)
 * @version 1.0.0
 * @since 1.0.0
 */
public final class Encrypt {

    // DO NOT CHANGE THIS, MORE ON THAT ON WEEK 7
    private Encrypt(){}

    // ============================================================================================
    // ================================== CAESAR'S ENCRYPTION =====================================
    // ============================================================================================

    /**
     * Method to encode a byte array message using a single character key
     * the key is simply added to each byte of the original message
     *
     * @param plainText The byte array representing the string to encode
     * @param key the byte corresponding to the char we use to shift
     * @return an encoded byte array
     */
    public static byte[] caesar(byte[] plainText, byte key) {
        return Helper.fail("NOT IMPLEMENTED");
    }

    // ============================================================================================
    // =============================== VIGENERE'S ENCRYPTION ======================================
    // ============================================================================================

    /**
     * Method to encode a byte array using a byte array keyword
     * The keyword is repeated along the message to encode
     * The bytes of the keyword are added to those of the message to encode
     * @param plainText the byte array representing the message to encode
     * @param keyword the byte array representing the key used to perform the shift
     * @return an encoded byte array
     */
    public static byte[] vigenere(byte[] plainText, byte[] keyword) {
        return Helper.fail("NOT IMPLEMENTED");
    }


    public static byte[] xor(byte[] plainText, byte key) {
        assert plainText.length != 0;

        byte[] encryptedText = new byte[plainText.length];
        for (int i=0 ; i< plainText.length; i++) {
            encryptedText[i] = (byte)(plainText[i]^key);
        }
        return encryptedText;
    }


    public static byte[] oneTimePad(byte[] plainText, byte[] pad) {
        assert plainText.length != 0;
        assert pad.length >= plainText.length;

        byte[] encryptedText = new byte[plainText.length];
        for (int i=0 ; i< plainText.length; i++) {
            encryptedText[i] = (byte)(plainText[i]^pad[i]);
        }
        return encryptedText;
    }


    public static void oneTimePad(byte[] plainText, byte[] pad, byte[] result) {
        assert plainText.length != 0;
        assert pad.length == plainText.length;
        assert result.length == plainText.length;

        // Aleatory generation of pad
        for (int i = 0; i<plainText.length; i++) {
            pad[i] = (byte)(int)(Math.random()*255);
        }

        // Encryption of plainText
        for (int i=0 ; i< plainText.length; i++) {
            result[i] = (byte)(plainText[i]^pad[i]);
        }
    }

    public static byte[] cbc(byte[] plainText, byte[] iv) {
        return Helper.fail("NOT IMPLEMENTED");
    }

}