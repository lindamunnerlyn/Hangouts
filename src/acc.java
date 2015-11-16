// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public final class acc
    implements Cloneable
{

    private int a;
    private byte b[];

    public acc(int i, String s)
    {
        if (s == null)
        {
            throw new NullPointerException("EncodedStringValue: Text-string is null");
        }
        a = i;
        try
        {
            b = s.getBytes(aca.a(i));
            return;
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            Log.e("EncodedStringValue", (new StringBuilder(45)).append("Input encoding ").append(i).append(" must be supported.").toString(), unsupportedencodingexception);
        }
        b = s.getBytes();
    }

    public acc(int i, byte abyte0[])
    {
        if (abyte0 == null)
        {
            throw new NullPointerException("EncodedStringValue: Text-string is null.");
        } else
        {
            a = i;
            b = new byte[abyte0.length];
            System.arraycopy(abyte0, 0, b, 0, abyte0.length);
            return;
        }
    }

    public acc(String s)
    {
        this(106, s);
    }

    public acc(byte abyte0[])
    {
        this(106, abyte0);
    }

    public static acc a(acc acc1)
    {
        if (acc1 == null)
        {
            return null;
        } else
        {
            return new acc(acc1.a, acc1.b);
        }
    }

    public static acc[] a(String as[])
    {
        int j = as.length;
        acc aacc[];
        if (j > 0)
        {
            acc aacc1[] = new acc[j];
            int i = 0;
            do
            {
                aacc = aacc1;
                if (i >= j)
                {
                    break;
                }
                aacc1[i] = new acc(as[i]);
                i++;
            } while (true);
        } else
        {
            aacc = null;
        }
        return aacc;
    }

    public int a()
    {
        return a;
    }

    public void a(byte abyte0[])
    {
        if (abyte0 == null)
        {
            throw new NullPointerException("EncodedStringValue: Text-string is null.");
        } else
        {
            b = new byte[abyte0.length];
            System.arraycopy(abyte0, 0, b, 0, abyte0.length);
            return;
        }
    }

    public void b(byte abyte0[])
    {
        if (abyte0 == null)
        {
            throw new NullPointerException("Text-string is null.");
        }
        if (b == null)
        {
            b = new byte[abyte0.length];
            System.arraycopy(abyte0, 0, b, 0, abyte0.length);
            return;
        }
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        try
        {
            bytearrayoutputstream.write(b);
            bytearrayoutputstream.write(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            abyte0.printStackTrace();
            throw new NullPointerException("appendTextString: failed when write a new Text-string");
        }
        b = bytearrayoutputstream.toByteArray();
    }

    public byte[] b()
    {
        byte abyte0[] = new byte[b.length];
        System.arraycopy(b, 0, abyte0, 0, b.length);
        return abyte0;
    }

    public String c()
    {
        if (a == 0)
        {
            return new String(b);
        }
        String s;
        try
        {
            s = aca.a(a);
            s = new String(b, s);
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            String s1;
            try
            {
                s1 = new String(b, "iso-8859-1");
            }
            catch (UnsupportedEncodingException unsupportedencodingexception1)
            {
                return new String(b);
            }
            return s1;
        }
        return s;
    }

    public Object clone()
    {
        super.clone();
        int i = b.length;
        byte abyte0[] = new byte[i];
        System.arraycopy(b, 0, abyte0, 0, i);
        acc acc1;
        try
        {
            acc1 = new acc(a, abyte0);
        }
        catch (Exception exception)
        {
            String s = String.valueOf(this);
            Log.e("EncodedStringValue", (new StringBuilder(String.valueOf(s).length() + 39)).append("failed to clone an EncodedStringValue: ").append(s).toString());
            exception.printStackTrace();
            throw new CloneNotSupportedException(exception.getMessage());
        }
        return acc1;
    }
}
