// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.ByteArrayOutputStream;

final class afb
{

    private static byte a = 61;

    public static final byte[] a(byte abyte0[])
    {
        ByteArrayOutputStream bytearrayoutputstream;
        int i;
        if (abyte0 == null)
        {
            return null;
        }
        bytearrayoutputstream = new ByteArrayOutputStream();
        i = 0;
_L7:
        if (i >= abyte0.length) goto _L2; else goto _L1
_L1:
        char c = abyte0[i];
        if (c != a) goto _L4; else goto _L3
_L3:
        int j;
        i++;
        try
        {
            c = Character.digit((char)abyte0[i], 16);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new afa("Invalid quoted-printable encoding");
        }
        i++;
        j = Character.digit((char)abyte0[i], 16);
        if (c != -1 && j != -1)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        throw new afa("Invalid quoted-printable encoding");
        c = (char)((c << 4) + j);
        bytearrayoutputstream.write(c);
_L5:
        i++;
        continue; /* Loop/switch isn't completed */
_L4:
        bytearrayoutputstream.write(c);
        if (true) goto _L5; else goto _L2
_L2:
        return bytearrayoutputstream.toByteArray();
        if (true) goto _L7; else goto _L6
_L6:
    }

}
