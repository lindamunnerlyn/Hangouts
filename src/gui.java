// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.StatFs;

final class gui
    implements guj
{

    gui()
    {
    }

    public long a()
    {
        return guh.d().getTotalBytes();
    }

    public long b()
    {
        return guh.d().getFreeBytes();
    }
}
