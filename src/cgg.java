// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.MotionEvent;
import com.google.android.apps.hangouts.peoplelistv2.impl.FastScrollingRecyclerView;

public final class cgg
    implements zg
{

    final FastScrollingRecyclerView a;
    private boolean b;

    public cgg(FastScrollingRecyclerView fastscrollingrecyclerview)
    {
        a = fastscrollingrecyclerview;
        super();
    }

    public void a(yr yr1, MotionEvent motionevent)
    {
        if (!b) goto _L2; else goto _L1
_L1:
        motionevent.getAction();
        JVM INSTR tableswitch 0 2: default 36
    //                   0 37
    //                   1 68
    //                   2 37;
           goto _L2 _L3 _L4 _L3
_L2:
        return;
_L3:
        yr1.a((int)(((float)a.c().a() * motionevent.getY()) / (float)FastScrollingRecyclerView.c(a)));
        return;
_L4:
        b = false;
        return;
    }

    public boolean a(MotionEvent motionevent)
    {
        if (motionevent.getX() > (float)(FastScrollingRecyclerView.a(a) - FastScrollingRecyclerView.b(a)))
        {
            b = true;
            return true;
        } else
        {
            return false;
        }
    }
}
