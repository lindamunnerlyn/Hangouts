// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.notifications.DndDialogActivity;

public final class cdb
    implements Runnable
{

    final DndDialogActivity a;

    public cdb(DndDialogActivity dnddialogactivity)
    {
        a = dnddialogactivity;
        super();
    }

    public void run()
    {
        a.finish();
    }
}
