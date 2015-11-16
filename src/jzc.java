// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

final class jzc extends jyq
{

    private final File a;

    jzc(File file)
    {
        a = (File)n.b(file);
    }

    public InputStream a()
    {
        return new FileInputStream(a);
    }

    public String toString()
    {
        String s = String.valueOf(a);
        return (new StringBuilder(String.valueOf(s).length() + 20)).append("Files.asByteSource(").append(s).append(")").toString();
    }
}
