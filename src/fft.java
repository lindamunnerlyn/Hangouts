// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;

public final class fft
{

    private final Intent a = new Intent("com.google.android.gms.location.places.ui.PICK_PLACE");

    public fft()
    {
        a.setPackage("com.google.android.gms");
        a.putExtra("gmscore_client_jar_version", ejk.a);
    }

    public Intent a(Context context)
    {
        ejk.a();
        ejk.b(context);
        return a;
    }

    public void a(String s)
    {
        a.putExtra("account_name", s);
    }
}
