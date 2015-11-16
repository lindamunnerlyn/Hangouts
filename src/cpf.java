// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;
import com.google.android.apps.hangouts.phone.ShortlinkUrlHandlerActivity;

public final class cpf
    implements android.content.DialogInterface.OnCancelListener
{

    final ShortlinkUrlHandlerActivity a;

    public cpf(ShortlinkUrlHandlerActivity shortlinkurlhandleractivity)
    {
        a = shortlinkurlhandleractivity;
        super();
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        a.finish();
    }
}
