// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;

public abstract class jra
{

    private static final jra a = new jrd("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", Character.valueOf('='));
    private static final jra b = new jrd("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", Character.valueOf('='));
    private static final jra c = new jrd("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", Character.valueOf('='));
    private static final jra d = new jrd("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", Character.valueOf('='));
    private static final jra e = new jrd("base16()", "0123456789ABCDEF", null);

    jra()
    {
    }

    public static jra b()
    {
        return b;
    }

    private byte[] b(CharSequence charsequence)
    {
        byte abyte0[];
        int i;
        String s = a().a(charsequence);
        charsequence = a(g.a(s));
        abyte0 = new byte[a(s.length())];
        int j;
        try
        {
            j = charsequence.a();
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence)
        {
            throw charsequence;
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence)
        {
            throw new AssertionError(charsequence);
        }
        i = 0;
        if (j == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        abyte0[i] = (byte)j;
        j = charsequence.a();
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_41;
_L1:
        if (i == abyte0.length)
        {
            return abyte0;
        } else
        {
            charsequence = new byte[i];
            System.arraycopy(abyte0, 0, charsequence, 0, i);
            return charsequence;
        }
    }

    abstract int a(int i);

    abstract jgb a();

    abstract jrg a(jrg jrg1);

    public final byte[] a(CharSequence charsequence)
    {
        try
        {
            charsequence = b(charsequence);
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence)
        {
            throw new IllegalArgumentException(charsequence);
        }
        return charsequence;
    }

}
