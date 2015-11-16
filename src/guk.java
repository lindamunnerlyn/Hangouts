// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.StatFs;

final class guk
    implements guj
{

    guk()
    {
    }

    public long a()
    {
        StatFs statfs = guh.d();
        long l = statfs.getBlockSize();
        return (long)statfs.getBlockCount() * l;
    }

    public long b()
    {
        StatFs statfs = guh.d();
        long l = statfs.getBlockSize();
        return (long)statfs.getFreeBlocks() * l;
    }
}
