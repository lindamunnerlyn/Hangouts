// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;
import com.google.android.apps.hangouts.phone.HangoutUrlHandlerActivity;

public final class coa
    implements android.content.DialogInterface.OnClickListener
{

    final HangoutUrlHandlerActivity a;

    public coa(HangoutUrlHandlerActivity hangouturlhandleractivity)
    {
        a = hangouturlhandleractivity;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        a.finish();
    }
}
