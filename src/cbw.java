// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

final class cbw
{

    final String a;
    final long b[];
    boolean c;
    cbu d;
    long e;
    final cbs f;

    cbw(cbs cbs1, String s)
    {
        f = cbs1;
        super();
        a = s;
        b = new long[cbs.f(cbs1)];
    }

    private static IOException b(String as[])
    {
        as = String.valueOf(Arrays.toString(as));
        if (as.length() != 0)
        {
            as = "unexpected journal line: ".concat(as);
        } else
        {
            as = new String("unexpected journal line: ");
        }
        throw new IOException(as);
    }

    public File a(int i)
    {
        File file = cbs.g(f);
        String s = a;
        return new File(file, (new StringBuilder(String.valueOf(s).length() + 12)).append(s).append(".").append(i).toString());
    }

    public String a()
    {
        StringBuilder stringbuilder = new StringBuilder();
        long al[] = b;
        int j = al.length;
        for (int i = 0; i < j; i++)
        {
            long l = al[i];
            stringbuilder.append(' ').append(l);
        }

        return stringbuilder.toString();
    }

    void a(String as[])
    {
        if (as.length != cbs.f(f))
        {
            throw b(as);
        }
        int i = 0;
        do
        {
            try
            {
                if (i >= as.length)
                {
                    break;
                }
                b[i] = Long.parseLong(as[i]);
            }
            catch (NumberFormatException numberformatexception)
            {
                throw b(as);
            }
            i++;
        } while (true);
    }

    public File b(int i)
    {
        File file = cbs.g(f);
        String s = a;
        return new File(file, (new StringBuilder(String.valueOf(s).length() + 16)).append(s).append(".").append(i).append(".tmp").toString());
    }
}
