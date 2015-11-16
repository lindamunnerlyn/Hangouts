// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.File;
import java.util.Comparator;

public final class bpo
    implements Comparator
{

    public bpo()
    {
    }

    public int compare(Object obj, Object obj1)
    {
        obj = (File)obj;
        return (int)(((File)obj1).lastModified() - ((File) (obj)).lastModified());
    }
}
