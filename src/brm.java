// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.google.android.apps.hangouts.hangout.ParticipantTrayView;

final class brm
    implements android.view.View.OnLongClickListener
{

    final brk a;

    brm(brk brk1)
    {
        a = brk1;
        super();
    }

    public boolean onLongClick(View view)
    {
        a.f.a(a);
        brk.a(a);
        return true;
    }
}
