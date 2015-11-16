// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base.metrics;


public class RecordUserAction
{

    public RecordUserAction()
    {
    }

    static void a(String s)
    {
        nativeRecordUserAction(s);
    }

    private static native void nativeRecordUserAction(String s);
}
