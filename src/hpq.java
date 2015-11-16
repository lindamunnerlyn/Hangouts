// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Random;

public final class hpq
{

    private static final Random a = new Random();
    private static final char b[] = "0123456789abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private static final ThreadLocal c = new hpr();

    public static String a(long l)
    {
        if (l < 1024L)
        {
            return (new StringBuilder(22)).append(l).append(" B").toString();
        } else
        {
            int i = (int)(Math.log(l) / Math.log(1024D));
            return String.format("%.1f %sB", new Object[] {
                Double.valueOf((double)l / Math.pow(1024D, i)), Character.valueOf("KMGTPE".charAt(i - 1))
            });
        }
    }

    private static String a(InputStream inputstream)
    {
        String s = (new BufferedReader(new InputStreamReader(inputstream))).readLine();
        if (s == null)
        {
            s = "";
        }
        inputstream.close();
        return s;
        Exception exception;
        exception;
        inputstream.close();
        throw exception;
    }

    public static String a(String s)
    {
        return a(((InputStream) (new FileInputStream(s))));
    }

    public static String a(StringBuilder stringbuilder)
    {
        String s = stringbuilder.toString();
        ((hps)c.get()).a(stringbuilder);
        return s;
    }

    public static StringBuilder a()
    {
        return ((hps)c.get()).a();
    }

    public static void a(String s, String s1)
    {
        FileOutputStream fileoutputstream = new FileOutputStream(s);
        s = fileoutputstream;
_L2:
        s = new BufferedWriter(new OutputStreamWriter(s));
        s.write(s1);
        s.close();
        return;
        FileNotFoundException filenotfoundexception;
        filenotfoundexception;
        File file = (new File(s)).getParentFile();
        if (file != null && !file.exists())
        {
            file.mkdirs();
            s = new FileOutputStream(s);
        } else
        {
            throw filenotfoundexception;
        }
        if (true) goto _L2; else goto _L1
_L1:
        s1;
        s.close();
        throw s1;
    }

}
