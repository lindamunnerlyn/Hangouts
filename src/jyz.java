// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.File;

public final class jyz
{

    private static final jyg a = new jza();

    public static void a(File file, File file1)
    {
        boolean flag;
        if (!file.equals(file1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        n.a(flag, "Source %s and destination %s must be different", new Object[] {
            file, file1
        });
        (new jzc(file)).a(new jzb(file1, new jyy[0]));
    }

}
