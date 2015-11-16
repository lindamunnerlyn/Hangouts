// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public final class kxe
{

    private InputStream a;
    private ByteArrayOutputStream b;

    public kxe(InputStream inputstream)
    {
        a = inputstream;
        try
        {
            b();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            System.out.println("IOException in CopyInputStream");
        }
        System.out.println(inputstream.toString());
    }

    private int b()
    {
        b = new ByteArrayOutputStream();
        byte abyte0[] = new byte[256];
        int i = 0;
        do
        {
            int j = a.read(abyte0);
            if (-1 != j)
            {
                i += 256;
                b.write(abyte0, 0, j);
            } else
            {
                b.flush();
                return i;
            }
        } while (true);
    }

    public ByteArrayInputStream a()
    {
        return new ByteArrayInputStream(b.toByteArray());
    }
}
