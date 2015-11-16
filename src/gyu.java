// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.StatFs;

final class gyu
    implements gyt
{

    gyu()
    {
    }

    public long a()
    {
        StatFs statfs = gyr.d();
        long l = statfs.getBlockSize();
        return (long)statfs.getBlockCount() * l;
    }

    public long b()
    {
        StatFs statfs = gyr.d();
        long l = statfs.getBlockSize();
        return (long)statfs.getFreeBlocks() * l;
    }
}
