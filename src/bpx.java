// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.File;
import java.util.Comparator;

public final class bpx
    implements Comparator
{

    public bpx()
    {
    }

    public int compare(Object obj, Object obj1)
    {
        obj = (File)obj;
        obj1 = (File)obj1;
        long l = ((File) (obj)).lastModified();
        long l1 = ((File) (obj1)).lastModified();
        if (l1 > l)
        {
            return 1;
        }
        return l1 >= l ? 0 : -1;
    }
}
