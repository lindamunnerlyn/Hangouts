// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.File;
import java.io.FilenameFilter;

final class com
    implements FilenameFilter
{

    final col a;

    com(col col)
    {
        a = col;
        super();
    }

    public boolean accept(File file, String s)
    {
        return s != null && (s.startsWith("mmsdump-") || s.startsWith("smsdump-"));
    }
}
