// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

final class jzb extends jyp
{

    private final File a;
    private final jth b;

    transient jzb(File file, jyy ajyy[])
    {
        a = (File)n.b(file);
        b = jth.a(ajyy);
    }

    public OutputStream a()
    {
        return new FileOutputStream(a, b.contains(jyy.a));
    }

    public String toString()
    {
        String s = String.valueOf(a);
        String s1 = String.valueOf(b);
        return (new StringBuilder(String.valueOf(s).length() + 20 + String.valueOf(s1).length())).append("Files.asByteSink(").append(s).append(", ").append(s1).append(")").toString();
    }
}
