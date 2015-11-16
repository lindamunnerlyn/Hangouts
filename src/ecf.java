// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Trace;

final class ecf extends ece
{

    ecf()
    {
        super((byte)0);
    }

    void a()
    {
        Trace.endSection();
    }

    void a(String s)
    {
        Trace.beginSection(s);
    }
}
