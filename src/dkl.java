// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public final class dkl
{

    private static final boolean a = false;

    public static ccg a(byte abyte0[])
    {
        return (ccg)c(abyte0);
    }

    public static byte[] a(ccg ccg1)
    {
        return a(((Serializable) (ccg1)));
    }

    public static byte[] a(cvn cvn1)
    {
        return a(((Serializable) (cvn1)));
    }

    private static byte[] a(Serializable serializable)
    {
        byte abyte0[];
        try
        {
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            ObjectOutputStream objectoutputstream = new ObjectOutputStream(bytearrayoutputstream);
            objectoutputstream.writeObject(serializable);
            objectoutputstream.close();
            abyte0 = bytearrayoutputstream.toByteArray();
            if (a)
            {
                Object obj = c(abyte0);
                String s = String.valueOf(serializable);
                obj = String.valueOf(obj);
                ebw.a("Babel_RequestWriter", (new StringBuilder(String.valueOf(s).length() + 37 + String.valueOf(obj).length())).append("encoded ").append(s).append(" ==> ...;  testing decode... ").append(((String) (obj))).toString());
            }
        }
        catch (IOException ioexception)
        {
            serializable = String.valueOf(serializable);
            ebw.e("Babel_RequestWriter", (new StringBuilder(String.valueOf(serializable).length() + 33)).append("got exception serializing object ").append(serializable).toString(), ioexception);
            return null;
        }
        return abyte0;
    }

    public static cvn b(byte abyte0[])
    {
        return (cvn)c(abyte0);
    }

    private static Serializable c(byte abyte0[])
    {
        try
        {
            abyte0 = (Serializable)(new ObjectInputStream(new ByteArrayInputStream(abyte0))).readObject();
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            ebw.e("Babel_RequestWriter", "error decoding serialized stream", abyte0);
            return null;
        }
        return abyte0;
    }

    static 
    {
        hik hik = ebw.o;
    }
}
