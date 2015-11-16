// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;
import com.google.android.apps.hangouts.phone.ClassZeroActivity;

public final class cll
    implements android.content.DialogInterface.OnClickListener
{

    final ClassZeroActivity a;

    public cll(ClassZeroActivity classzeroactivity)
    {
        a = classzeroactivity;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        ClassZeroActivity.a(a, true);
        ClassZeroActivity.b(a);
        dialoginterface.dismiss();
        ClassZeroActivity.c(a);
    }
}
