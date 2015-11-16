// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public final class ace
    implements Cloneable
{

    int a;
    byte b[];

    public ace(int i, String s)
    {
        if (s == null)
        {
            throw new NullPointerException("EncodedStringValue: Text-string is null");
        }
        a = i;
        try
        {
            b = s.getBytes(acc.a(i));
            return;
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            Log.e("EncodedStringValue", (new StringBuilder(45)).append("Input encoding ").append(i).append(" must be supported.").toString(), unsupportedencodingexception);
        }
        b = s.getBytes();
    }

    public ace(int i, byte abyte0[])
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

    public ace(String s)
    {
        this(106, s);
    }

    public ace(byte abyte0[])
    {
        this(106, abyte0);
    }

    public static ace[] a(String as[])
    {
        int j = as.length;
        ace aace[];
        if (j > 0)
        {
            ace aace1[] = new ace[j];
            int i = 0;
            do
            {
                aace = aace1;
                if (i >= j)
                {
                    break;
                }
                aace1[i] = new ace(as[i]);
                i++;
            } while (true);
        } else
        {
            aace = null;
        }
        return aace;
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
            s = acc.a(a);
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
        ace ace1;
        try
        {
            ace1 = new ace(a, abyte0);
        }
        catch (Exception exception)
        {
            String s = String.valueOf(this);
            Log.e("EncodedStringValue", (new StringBuilder(String.valueOf(s).length() + 39)).append("failed to clone an EncodedStringValue: ").append(s).toString());
            exception.printStackTrace();
            throw new CloneNotSupportedException(exception.getMessage());
        }
        return ace1;
    }
}
