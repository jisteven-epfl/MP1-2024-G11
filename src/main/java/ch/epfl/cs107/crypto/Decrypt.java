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
 * <b>Task 2: </b>Utility class to decrypt a given cipher text.
 *
 * @author Hamza REMMAL (hamza.remmal@epfl.ch)
 * @version 1.0.0
 * @since 1.0.0
 */
public final class Decrypt {

    // DO NOT CHANGE THIS, MORE ON THAT ON WEEK 7
    private Decrypt(){}

    // ============================================================================================
    // ================================== CAESAR'S ENCRYPTION =====================================
    // ============================================================================================

    /**
     * Method to decode a byte array message using a single character key
     * <p>
     * @param cipher Cipher message to decode
     * @param key Key to decode with
     * @return decoded message
     */
    public static byte[] caesar(byte[] cipher, byte key) {
        return Helper.fail("NOT IMPLEMENTED");
    }

    // ============================================================================================
    // =============================== VIGENERE'S ENCRYPTION ======================================
    // ============================================================================================

    /**
     * Method to encode a byte array using a byte array keyword
     * @param cipher Cipher message to decode
     * @param keyword Key to decode with
     * @return decoded message
     */
    public static byte[] vigenere(byte[] cipher, byte[] keyword) {
        return Helper.fail("NOT IMPLEMENTED");
    }


    public static byte[] xor(byte[] cipher, byte key) {
        assert cipher.length != 0;

        byte[] decryptedText = new byte[cipher.length];
        for (int i=0 ; i< cipher.length; i++) {
            decryptedText[i] = (byte)(cipher[i]^key);
        }
        return decryptedText;
    }


    public static byte[] oneTimePad(byte[] cipher, byte[] pad) {
        assert cipher.length != 0;
        assert pad.length >= cipher.length;

        byte[] decryptedText = new byte[cipher.length];
        for (int i=0 ; i< cipher.length; i++) {
            decryptedText[i] = (byte)(cipher[i]^pad[i]);
        }
        return decryptedText;
    }


    public static byte[] cbc(byte[] cipher, byte[] iv) {
        return Helper.fail("NOT IMPLEMENTED");
    }
}
