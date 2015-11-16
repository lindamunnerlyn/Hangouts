// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class jyj
{

    private static final jyj a = new jym("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", Character.valueOf('='));
    private static final jyj b = new jym("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", Character.valueOf('='));
    private static final jyj c = new jyo("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", Character.valueOf('='));
    private static final jyj d = new jyo("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", Character.valueOf('='));
    private static final jyj e = new jyl("base16()", "0123456789ABCDEF");

    jyj()
    {
    }

    public static jyj b()
    {
        return b;
    }

    abstract int a(int i);

    abstract int a(byte abyte0[], CharSequence charsequence);

    abstract jmr a();

    public final byte[] a(CharSequence charsequence)
    {
        int i;
        String s = a().a(charsequence);
        charsequence = new byte[a(s.length())];
        i = a(((byte []) (charsequence)), ((CharSequence) (s)));
        if (i == charsequence.length)
        {
            return charsequence;
        }
        byte abyte0[];
        try
        {
            abyte0 = new byte[i];
            System.arraycopy(charsequence, 0, abyte0, 0, i);
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence)
        {
            throw new IllegalArgumentException(charsequence);
        }
        return abyte0;
    }

}
