// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.google.android.apps.hangouts.hangout.ParticipantTrayView;

final class brl
    implements android.view.View.OnClickListener
{

    final brk a;

    brl(brk brk1)
    {
        a = brk1;
        super();
    }

    public void onClick(View view)
    {
        a.f.a(a);
        a.d();
        a.e();
    }
}
