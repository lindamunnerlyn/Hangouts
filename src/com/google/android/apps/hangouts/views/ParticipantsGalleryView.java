// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.views;

import ahb;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import aoa;
import aon;
import cfz;
import cgd;
import dcn;
import ecj;
import eec;
import eep;
import eev;
import ejc;
import ejd;
import eje;
import ejf;
import ejg;
import ejh;
import ejj;
import g;
import gqu;
import h;
import hlp;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Queue;

// Referenced classes of package com.google.android.apps.hangouts.views:
//            OverlayedAvatarView

public class ParticipantsGalleryView extends FrameLayout
    implements ecj
{

    private static final boolean a = false;
    private boolean b;
    private boolean c;
    private ecj d;
    private LayoutTransition e;
    private LayoutTransition f;
    private ejf g;
    private final int h;
    private final int i;
    private int j;
    private final ViewGroup k;
    private int l;
    private int m;
    private final eec n;
    private final eec o;
    private boolean p;
    private int q;
    private aoa r;
    private final Handler s;
    private final Queue t;
    private boolean u;

    public ParticipantsGalleryView(Context context)
    {
        this(context, null);
    }

    public ParticipantsGalleryView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        j = -1;
        n = new eec();
        o = new eec();
        p = true;
        q = 0;
        r = null;
        s = new ejg(this);
        t = new LinkedList();
        u = false;
        r = dcn.e(((gqu)hlp.a(context, gqu)).a());
        attributeset = context.getTheme().obtainStyledAttributes(attributeset, ahb.Y, 0, 0);
        c = attributeset.getBoolean(ahb.Z, false);
        attributeset.recycle();
        LayoutInflater.from(context).inflate(g.gK, this, true);
        k = (ViewGroup)findViewById(h.ee);
        h = getResources().getInteger(g.eZ);
        i = getResources().getInteger(g.eW);
        context = new LayoutTransition();
        int i1 = aon.a();
        context.setAnimator(3, ObjectAnimator.ofFloat(null, "translationY", new float[] {
            0.0F, (float)(i1 + 20)
        }));
        context.setAnimator(2, ObjectAnimator.ofFloat(null, "translationY", new float[] {
            (float)(i1 + 20), 0.0F
        }));
        context.setStartDelay(2, context.getDuration(0));
        context.setDuration(h);
        f = context;
        context = new LayoutTransition();
        context.setAnimator(3, ObjectAnimator.ofFloat(null, "alpha", new float[] {
            1.0F, 0.0F
        }));
        context.setAnimator(2, ObjectAnimator.ofFloat(null, "alpha", new float[] {
            0.0F, 1.0F
        }));
        context.setDuration(h);
        context.setStartDelay(1, context.getDuration(3));
        e = context;
        k.setLayoutTransition(f);
        g();
        return;
        context;
        attributeset.recycle();
        throw context;
    }

    public static int a(ParticipantsGalleryView participantsgalleryview, int i1)
    {
        return participantsgalleryview.d(i1);
    }

    private static String a(List list)
    {
        StringBuilder stringbuilder = new StringBuilder();
        for (list = list.iterator(); list.hasNext(); stringbuilder.append(((cfz)list.next()).b.b).append(" ")) { }
        return stringbuilder.toString();
    }

    private void a(int i1, int j1)
    {
        OverlayedAvatarView.b(i1);
        JVM INSTR tableswitch 1 4: default 36
    //                   1 83
    //                   2 73
    //                   3 36
    //                   4 73;
           goto _L1 _L2 _L3 _L1 _L3
_L3:
        l = l - 1;
_L2:
        m = m - 1;
_L1:
        switch (OverlayedAvatarView.b(j1))
        {
        case 3: // '\003'
        default:
            return;

        case 2: // '\002'
        case 4: // '\004'
            l = l + 1;
            // fall through

        case 1: // '\001'
            m = m + 1;
            break;
        }
        return;
    }

    private void a(cfz cfz1, OverlayedAvatarView overlayedavatarview, int i1, boolean flag)
    {
        boolean flag1 = true;
        int j1 = d(i1);
        overlayedavatarview.e(i1);
        synchronized (n)
        {
            n.put(cfz1.b, overlayedavatarview);
        }
        g();
        if (overlayedavatarview.a() != 1)
        {
            flag1 = false;
        }
        if (!flag)
        {
            h();
        } else
        if (flag1)
        {
            k.setLayoutTransition(e);
        } else
        {
            k.setLayoutTransition(f);
        }
        a(overlayedavatarview, j1, i1, cfz1.e, cfz1.h);
        return;
        cfz1;
        eec1;
        JVM INSTR monitorexit ;
        throw cfz1;
    }

    private void a(OverlayedAvatarView overlayedavatarview, int i1)
    {
        if (a)
        {
            String s2 = String.valueOf(overlayedavatarview.g());
            String s1;
            if (b)
            {
                s1 = "focus gallery.";
            } else
            {
                s1 = "watermark.";
            }
            eev.b("Babel", (new StringBuilder(String.valueOf(s2).length() + 39 + String.valueOf(s1).length())).append("[PartGallery] Removing from layout ").append(s2).append(" in ").append(s1).toString());
        }
        if (k.indexOfChild(overlayedavatarview) < 0) goto _L2; else goto _L1
_L1:
        a(i1, 0);
        k.removeView(overlayedavatarview);
_L4:
        if (a)
        {
            a(new Throwable(), overlayedavatarview, (new StringBuilder(18)).append("Remove ").append(i1).toString());
        }
        return;
_L2:
        eev.g("Babel", "removeAvatarViewFromLayout: removing an avatar not inserted");
        if (a)
        {
            a(((Throwable) (null)), ((OverlayedAvatarView) (null)), "------> ERROR <------ : Removing an avatar not inserted");
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void a(OverlayedAvatarView overlayedavatarview, int i1, int j1, String s1, String s2)
    {
        if (a)
        {
            String s4 = String.valueOf(overlayedavatarview.g());
            String s3;
            if (b)
            {
                s3 = "focus gallery.";
            } else
            {
                s3 = "watermark.";
            }
            eev.b("Babel", (new StringBuilder(String.valueOf(s4).length() + 30 + String.valueOf(s3).length())).append("[PartGallery] Inserting ").append(s4).append(" into ").append(s3).toString());
        }
        k.endViewTransition(overlayedavatarview);
        if (k.indexOfChild(overlayedavatarview) >= 0 || i1 < 0 || i1 > k.getChildCount()) goto _L2; else goto _L1
_L1:
        a(0, j1);
        try
        {
            k.addView(overlayedavatarview, i1);
            overlayedavatarview.a(s2, s1, r);
            requestLayout();
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            s2 = String.valueOf(s1);
            eev.g("Babel", (new StringBuilder(String.valueOf(s2).length() + 51)).append("insertAvatarViewIntoLayout: this should not happen ").append(s2).toString());
            if (a)
            {
                s1 = String.valueOf(s1);
                a(((Throwable) (null)), ((OverlayedAvatarView) (null)), (new StringBuilder(String.valueOf(s1).length() + 47)).append("------> ERROR <------ : This should not happen ").append(s1).toString());
            }
            a(j1, 0);
            synchronized (n)
            {
                n.remove(overlayedavatarview.g());
            }
            g();
            synchronized (o)
            {
                o.remove(overlayedavatarview.g());
            }
        }
_L4:
        if (a)
        {
            a(new Throwable(), overlayedavatarview, (new StringBuilder(36)).append("Insert at ").append(i1).append(" to ").append(j1).toString());
        }
        return;
        overlayedavatarview;
        s1;
        JVM INSTR monitorexit ;
        throw overlayedavatarview;
        overlayedavatarview;
        s1;
        JVM INSTR monitorexit ;
        throw overlayedavatarview;
_L2:
        int k1 = k.indexOfChild(overlayedavatarview);
        int i2 = k.getChildCount();
        eev.g("Babel", (new StringBuilder(127)).append("insertAvatarViewIntoLayout: inserting already inserted @").append(k1).append(", or wrong index ").append(i1).append(" with ViewGroup size ").append(i2).toString());
        if (a)
        {
            int l1 = k.indexOfChild(overlayedavatarview);
            int j2 = k.getChildCount();
            a(((Throwable) (null)), ((OverlayedAvatarView) (null)), (new StringBuilder(123)).append("------> ERROR <------ : Inserting already inserted @").append(l1).append(", or wrong index ").append(i1).append(" with ViewGroup size ").append(j2).toString());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void a(ParticipantsGalleryView participantsgalleryview)
    {
        boolean flag;
        if (participantsgalleryview.m == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag != participantsgalleryview.p)
        {
            participantsgalleryview.p = flag;
            if (participantsgalleryview.g != null)
            {
                participantsgalleryview.g.a(participantsgalleryview.p);
            }
        }
    }

    public static void a(ParticipantsGalleryView participantsgalleryview, cfz cfz1)
    {
        synchronized (participantsgalleryview.o)
        {
            participantsgalleryview.o.remove(cfz1.b);
        }
        return;
        participantsgalleryview;
        eec1;
        JVM INSTR monitorexit ;
        throw participantsgalleryview;
    }

    public static void a(ParticipantsGalleryView participantsgalleryview, OverlayedAvatarView overlayedavatarview, int i1, int j1, String s1, String s2)
    {
        participantsgalleryview.a(overlayedavatarview, i1, j1, s1, s2);
    }

    public static void a(ParticipantsGalleryView participantsgalleryview, OverlayedAvatarView overlayedavatarview, String s1)
    {
        participantsgalleryview.a(((Throwable) (null)), overlayedavatarview, s1);
    }

    public static void a(ParticipantsGalleryView participantsgalleryview, ejj ejj, ejd ejd1)
    {
        participantsgalleryview.u = true;
        if (!(ejj instanceof ejh)) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = (ejh)ejj;
        if (a)
        {
            String s1;
            String s3;
            int j1;
            boolean flag3;
            if (((ejh) (obj)).c)
            {
                ejj = "set";
            } else
            {
                ejj = "unset";
            }
            s1 = String.valueOf(OverlayedAvatarView.a(((ejh) (obj)).b));
            s3 = String.valueOf(((ejh) (obj)).a.b);
            eev.b("Babel", (new StringBuilder(String.valueOf(ejj).length() + 50 + String.valueOf(s1).length() + String.valueOf(s3).length())).append("[PartGallery] change participant state  ").append(ejj).append(" ").append(s1).append(" bit for ").append(s3).toString());
        }
        if (!((ejh) (obj)).c) goto _L4; else goto _L3
_L3:
        cfz cfz1 = ((ejh) (obj)).a;
        j1 = ((ejh) (obj)).b;
        boolean flag1 = ((ejh) (obj)).d;
        obj = participantsgalleryview.c(cfz1);
        boolean flag = false;
        ejj = ((ejj) (obj));
        if (obj == null)
        {
            flag = true;
            ejj = participantsgalleryview.b(cfz1);
        }
        int l1 = ejj.b();
        int j2 = ejj.d(j1);
        int l2 = OverlayedAvatarView.b(j2);
        int j3 = OverlayedAvatarView.b(l1);
        if (participantsgalleryview.d(cfz1))
        {
            ejj.f(j2);
            flag3 = false;
            flag1 = flag3;
            if (a)
            {
                participantsgalleryview.a(((Throwable) (null)), ((OverlayedAvatarView) (ejj)), (new StringBuilder(47)).append("SetState (COALESCED) ").append(l1).append(" -> ").append(j2).toString());
                flag1 = flag3;
            }
        } else
        if (l2 == j3)
        {
            ejj.e(j2);
            if (a)
            {
                participantsgalleryview.a(((Throwable) (null)), ((OverlayedAvatarView) (ejj)), (new StringBuilder(43)).append("SetState (HI EQ) ").append(l1).append(" -> ").append(j2).toString());
            }
            flag1 = false;
        } else
        if (l2 == 4 && j3 == 2)
        {
            ejj.e(j2);
            if (a)
            {
                participantsgalleryview.a(((Throwable) (null)), ((OverlayedAvatarView) (ejj)), (new StringBuilder(42)).append("SetState (F->T) ").append(l1).append(" -> ").append(j2).toString());
            }
            flag1 = true;
        } else
        {
            if (flag)
            {
                participantsgalleryview.a(cfz1, ((OverlayedAvatarView) (ejj)), j2, flag1);
            } else
            {
                participantsgalleryview.a(ejd1, cfz1, ((OverlayedAvatarView) (ejj)), l1, j2);
            }
            flag1 = true;
        }
_L10:
        ejd1.a(flag1);
        if (j1 == 2)
        {
            if (a)
            {
                ejj = String.valueOf(cfz1.b);
                eev.b("Babel", (new StringBuilder(String.valueOf(ejj).length() + 25)).append("Focus state set for user ").append(ejj).toString());
            }
            if (participantsgalleryview.g != null)
            {
                participantsgalleryview.g.a();
            }
        }
_L6:
        return;
_L4:
        ejj = ((ejh) (obj)).a;
        int i1 = ((ejh) (obj)).b;
        boolean flag7 = ((ejh) (obj)).d;
        obj = participantsgalleryview.c(ejj);
        boolean flag5 = true;
        boolean flag6 = false;
        boolean flag2 = flag6;
        boolean flag4 = flag5;
        if (obj != null)
        {
            int k1 = ((OverlayedAvatarView) (obj)).b();
            int i2 = ((OverlayedAvatarView) (obj)).c(i1);
            int k2 = OverlayedAvatarView.b(i2);
            int i3 = OverlayedAvatarView.b(k1);
            if (participantsgalleryview.d(ejj))
            {
                ((OverlayedAvatarView) (obj)).f(i2);
                flag2 = flag6;
                flag4 = flag5;
                if (a)
                {
                    participantsgalleryview.a(((Throwable) (null)), ((OverlayedAvatarView) (obj)), (new StringBuilder(49)).append("UnsetState (COALESCED) ").append(k1).append(" -> ").append(i2).toString());
                    flag4 = flag5;
                    flag2 = flag6;
                }
            } else
            if (k2 == i3)
            {
                ((OverlayedAvatarView) (obj)).e(i2);
                if (a)
                {
                    participantsgalleryview.a(((Throwable) (null)), ((OverlayedAvatarView) (obj)), (new StringBuilder(45)).append("UnsetState (HI EQ) ").append(k1).append(" -> ").append(i2).toString());
                }
                flag2 = false;
                flag4 = flag5;
            } else
            if (k2 == 2 && i3 == 4)
            {
                ((OverlayedAvatarView) (obj)).e(i2);
                if (a)
                {
                    participantsgalleryview.a(((Throwable) (null)), ((OverlayedAvatarView) (obj)), (new StringBuilder(44)).append("UnsetState (T->F) ").append(k1).append(" -> ").append(i2).toString());
                }
                flag2 = true;
                flag4 = flag5;
            } else
            {
                if (i2 == 0)
                {
                    flag2 = participantsgalleryview.b(ejj, k1, flag7);
                } else
                {
                    flag2 = participantsgalleryview.a(ejd1, ((cfz) (ejj)), ((OverlayedAvatarView) (obj)), k1, i2);
                }
                flag4 = flag2;
                flag2 = true;
            }
        }
        if (flag4)
        {
            ejd1.a(flag2);
        }
        if (obj == null || i1 != 2) goto _L6; else goto _L5
_L5:
        if (a)
        {
            ejj = String.valueOf(((cfz) (ejj)).b);
            eev.b("Babel", (new StringBuilder(String.valueOf(ejj).length() + 27)).append("Focus state unset for user ").append(ejj).toString());
        }
        if (participantsgalleryview.g == null) goto _L6; else goto _L7
_L7:
        participantsgalleryview.g.a();
        return;
_L2:
        if (!(ejj instanceof eje)) goto _L6; else goto _L8
_L8:
        eje eje1 = (eje)ejj;
        if (a)
        {
            if (eje1.c)
            {
                ejj = "set";
            } else
            {
                ejj = "unset";
            }
            eev.b("Babel", (new StringBuilder(String.valueOf(ejj).length() + 71)).append("[PartGallery] batch change participant state  ").append(ejj).append(" watermark bit for users:").toString());
            String s2;
            for (ejj = eje1.a.iterator(); ejj.hasNext(); eev.b("Babel", (new StringBuilder(String.valueOf(s2).length() + 2)).append("  ").append(s2).toString()))
            {
                s2 = String.valueOf(((cfz)ejj.next()).b);
            }

        }
        if (eje1.c)
        {
            participantsgalleryview.b(ejd1, eje1.a, eje1.b);
            return;
        }
        participantsgalleryview.a(ejd1, eje1.a, eje1.b);
        return;
        if (true) goto _L10; else goto _L9
_L9:
    }

    private void a(ejd ejd1, List list, boolean flag)
    {
        list = list.iterator();
        boolean flag1 = false;
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            cfz cfz1 = (cfz)list.next();
            if (cfz1 == null)
            {
                eev.g("Babel", "ParticipantsGalleryView.internalExecuteBatchWatermarkeUnset: null participant");
            } else
            {
                OverlayedAvatarView overlayedavatarview = c(cfz1);
                if (overlayedavatarview != null)
                {
                    int i1 = overlayedavatarview.b();
                    int j1 = overlayedavatarview.c(1);
                    int k1 = OverlayedAvatarView.b(j1);
                    int l1 = OverlayedAvatarView.b(i1);
                    if (d(cfz1))
                    {
                        overlayedavatarview.f(j1);
                        if (a)
                        {
                            a(((Throwable) (null)), overlayedavatarview, (new StringBuilder(53)).append("UnsetWatermark (COALESCED) ").append(i1).append(" -> ").append(j1).toString());
                        }
                    } else
                    if (k1 == l1)
                    {
                        overlayedavatarview.e(j1);
                        if (a)
                        {
                            a(((Throwable) (null)), overlayedavatarview, (new StringBuilder(49)).append("UnsetWatermark (HI EQ) ").append(i1).append(" -> ").append(j1).toString());
                        }
                    } else
                    if (j1 == 0)
                    {
                        b(cfz1, i1, flag);
                        flag1 = true;
                    }
                }
            }
        } while (true);
        ejd1.a(flag1);
    }

    private void a(ejj ejj)
    {
        t.offer(ejj);
        if (!u && !s.hasMessages(0))
        {
            s.sendEmptyMessage(0);
        }
    }

    private void a(Throwable throwable, OverlayedAvatarView overlayedavatarview, String s1)
    {
        if (!b)
        {
            return;
        }
        StringBuilder stringbuilder = new StringBuilder();
        if (s1 != null)
        {
            stringbuilder.append(String.format(Locale.US, "%1$-96s", new Object[] {
                s1
            }));
        }
        if (overlayedavatarview != null)
        {
            stringbuilder.append(" :");
            stringbuilder.append(" Participant=").append(overlayedavatarview.g().b).append(".");
            stringbuilder.append(OverlayedAvatarView.a(overlayedavatarview.b()).replace("STATE_", "").subSequence(0, 1)).append(".");
            int i1;
            if (o.get(overlayedavatarview.g()) != null)
            {
                stringbuilder.append(OverlayedAvatarView.a(overlayedavatarview.c()).replace("STATE_", "").subSequence(0, 1));
            } else
            {
                stringbuilder.append("-");
            }
            stringbuilder.append(" Indices=(").append(l).append(", ");
            stringbuilder.append(m).append(") ");
            stringbuilder.append(" Avatars=[");
            i1 = 0;
            while (i1 < k.getChildCount()) 
            {
                if (i1 > 0)
                {
                    stringbuilder.append(", ");
                }
                overlayedavatarview = k.getChildAt(i1);
                if (overlayedavatarview instanceof OverlayedAvatarView)
                {
                    overlayedavatarview = (OverlayedAvatarView)overlayedavatarview;
                    stringbuilder.append(overlayedavatarview.g().b).append(".");
                    stringbuilder.append(OverlayedAvatarView.a(overlayedavatarview.b()).replace("STATE_", "").subSequence(0, 1));
                } else
                {
                    stringbuilder.append(overlayedavatarview.getVisibility());
                }
                i1++;
            }
            stringbuilder.append("]");
        }
        if (throwable != null)
        {
            stringbuilder.append(" @ ").append(Log.getStackTraceString(throwable).replace("\t", "").replace("\n", " ==> ").replace("com.google.android.apps.hangouts", "").subSequence(0, 512));
        }
        int j1 = System.identityHashCode(this);
        throwable = String.valueOf(stringbuilder.toString());
        eev.b("Babel", (new StringBuilder(String.valueOf(throwable).length() + 23)).append("WATERMARK[").append(j1).append("]\t").append(throwable).toString());
    }

    private boolean a(ejd ejd1, cfz cfz1, OverlayedAvatarView overlayedavatarview, int i1, int j1)
    {
        ViewGroup viewgroup = k;
        a(i1, 0);
        int k1 = d(j1);
        a(0, i1);
        if (viewgroup.getChildAt(k1) != overlayedavatarview)
        {
            overlayedavatarview.f(j1);
            if (a)
            {
                a(((Throwable) (null)), overlayedavatarview, (new StringBuilder(39)).append("Move (start) ").append(i1).append(" -> ").append(j1).toString());
            }
            k.setLayoutTransition(e);
            a(overlayedavatarview, i1);
            overlayedavatarview = new ejc(this, overlayedavatarview, cfz1, ejd1, i1, j1);
            postDelayed(overlayedavatarview, h);
            synchronized (o)
            {
                o.put(cfz1.b, overlayedavatarview);
            }
            return false;
        }
        break MISSING_BLOCK_LABEL_165;
        cfz1;
        ejd1;
        JVM INSTR monitorexit ;
        throw cfz1;
        a(i1, j1);
        overlayedavatarview.e(j1);
        if (a)
        {
            a(((Throwable) (null)), overlayedavatarview, (new StringBuilder(31)).append("Move ").append(i1).append(" -> ").append(j1).toString());
        }
        return true;
    }

    public static int b(ParticipantsGalleryView participantsgalleryview)
    {
        return participantsgalleryview.i;
    }

    private OverlayedAvatarView b(cfz cfz1)
    {
        boolean flag = true;
        OverlayedAvatarView overlayedavatarview = OverlayedAvatarView.a(LayoutInflater.from(getContext()), cfz1.e, cfz1.b, j, this);
        if (q != 1)
        {
            flag = false;
        }
        overlayedavatarview.a(flag);
        overlayedavatarview.setTag(cfz1);
        return overlayedavatarview;
    }

    private void b(ejd ejd1, List list, boolean flag)
    {
        Iterator iterator = list.iterator();
        boolean flag1 = false;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            cfz cfz1 = (cfz)iterator.next();
            if (cfz1 == null)
            {
                eev.g("Babel", "ParticipantsGalleryView.internalExecuteBatchWatermarkSet: null participant");
            } else
            {
                OverlayedAvatarView overlayedavatarview = c(cfz1);
                list = overlayedavatarview;
                if (overlayedavatarview == null)
                {
                    list = b(cfz1);
                }
                int i1 = list.b();
                int j1 = list.d(1);
                int k1 = OverlayedAvatarView.b(j1);
                int l1 = OverlayedAvatarView.b(i1);
                if (d(cfz1))
                {
                    list.f(j1);
                    if (a)
                    {
                        a(((Throwable) (null)), list, (new StringBuilder(51)).append("SetWatermark (COALESCED) ").append(i1).append(" -> ").append(j1).toString());
                    }
                } else
                if (k1 == l1)
                {
                    list.e(j1);
                    if (a)
                    {
                        a(((Throwable) (null)), list, (new StringBuilder(47)).append("SetWatermark (HI EQ) ").append(i1).append(" -> ").append(j1).toString());
                    }
                } else
                if (j1 == 1)
                {
                    a(cfz1, list, j1, flag);
                    flag1 = true;
                }
            }
        } while (true);
        ejd1.a(flag1);
    }

    private boolean b(cfz cfz1, int i1, boolean flag)
    {
        obj = c(cfz1);
        boolean flag1;
        if (((OverlayedAvatarView) (obj)).a() == 1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag)
        {
            if (flag1)
            {
                k.setLayoutTransition(e);
            } else
            {
                k.setLayoutTransition(f);
            }
            a(((OverlayedAvatarView) (obj)), i1);
        } else
        {
            h();
            a(((OverlayedAvatarView) (obj)), i1);
        }
        synchronized (n)
        {
            n.remove(cfz1.b);
        }
        g();
        return true;
        cfz1;
        obj;
        JVM INSTR monitorexit ;
        throw cfz1;
    }

    public static Handler c(ParticipantsGalleryView participantsgalleryview)
    {
        return participantsgalleryview.s;
    }

    private OverlayedAvatarView c(cfz cfz1)
    {
        synchronized (n)
        {
            cfz1 = (OverlayedAvatarView)n.get(cfz1.b);
        }
        return cfz1;
        cfz1;
        eec1;
        JVM INSTR monitorexit ;
        throw cfz1;
    }

    private int d(int i1)
    {
        switch (OverlayedAvatarView.b(i1))
        {
        case 3: // '\003'
        default:
            return 0;

        case 2: // '\002'
        case 4: // '\004'
            return l;

        case 1: // '\001'
            return m;
        }
    }

    private boolean d(cfz cfz1)
    {
        eec eec1 = o;
        eec1;
        JVM INSTR monitorenter ;
        boolean flag;
        if (o.get(cfz1.b) != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        eec1;
        JVM INSTR monitorexit ;
        return flag;
        cfz1;
        eec1;
        JVM INSTR monitorexit ;
        throw cfz1;
    }

    public static boolean d(ParticipantsGalleryView participantsgalleryview)
    {
        participantsgalleryview.u = false;
        return false;
    }

    public static Queue e(ParticipantsGalleryView participantsgalleryview)
    {
        return participantsgalleryview.t;
    }

    public static eec f(ParticipantsGalleryView participantsgalleryview)
    {
        return participantsgalleryview.n;
    }

    public static boolean f()
    {
        return a;
    }

    private void g()
    {
        eec eec1 = n;
        eec1;
        JVM INSTR monitorenter ;
        Object obj;
        Object obj1;
        obj = new StringBuilder();
        obj1 = n.values().iterator();
_L2:
        OverlayedAvatarView overlayedavatarview;
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break MISSING_BLOCK_LABEL_82;
            }
            overlayedavatarview = (OverlayedAvatarView)((Iterator) (obj1)).next();
        } while (overlayedavatarview == null);
        if (TextUtils.isEmpty(overlayedavatarview.getContentDescription())) goto _L2; else goto _L1
_L1:
        eep.a(((StringBuilder) (obj)), overlayedavatarview.getContentDescription());
          goto _L2
        obj;
        eec1;
        JVM INSTR monitorexit ;
        throw obj;
        if (((StringBuilder) (obj)).length() != 0) goto _L4; else goto _L3
_L3:
        setContentDescription(null);
_L5:
        eec1;
        JVM INSTR monitorexit ;
        if (d != null)
        {
            d.b();
        }
        return;
_L4:
        int i1;
        obj1 = getResources();
        if (!b)
        {
            break MISSING_BLOCK_LABEL_161;
        }
        i1 = g.hx;
_L6:
        setContentDescription(((Resources) (obj1)).getQuantityString(i1, n.size(), new Object[] {
            ((StringBuilder) (obj)).toString()
        }));
          goto _L5
        i1 = g.hQ;
          goto _L6
    }

    public static void g(ParticipantsGalleryView participantsgalleryview)
    {
        participantsgalleryview.g();
    }

    private LayoutTransition h()
    {
        LayoutTransition layouttransition = k.getLayoutTransition();
        k.setLayoutTransition(null);
        return layouttransition;
    }

    public void a()
    {
        if (getVisibility() == 0)
        {
            setVisibility(8);
        }
    }

    public void a(int i1)
    {
        setTranslationY(i1);
        setVisibility(0);
    }

    public void a(int i1, aoa aoa)
    {
        c(i1);
        r = aoa;
    }

    public void a(cfz cfz1)
    {
        while (cfz1 == null || cfz1.b == null || !n.containsKey(cfz1.b)) 
        {
            return;
        }
        a(cfz1, 2, false);
    }

    public void a(cfz cfz1, int i1)
    {
        if (cfz1 == null)
        {
            eev.g("Babel", "ParticipantsGalleryView.setParticipantState: null participant");
            return;
        }
        if (a)
        {
            Throwable throwable = new Throwable();
            String s1 = String.valueOf(cfz1.b.b);
            a(throwable, ((OverlayedAvatarView) (null)), (new StringBuilder(String.valueOf(s1).length() + 43)).append("+++ SetParticipantState ").append(s1).append(" setBit=").append(i1).toString());
        }
        a(((ejj) (new ejh(cfz1, i1, true, true))));
    }

    public void a(cfz cfz1, int i1, boolean flag)
    {
        if (cfz1 == null)
        {
            eev.g("Babel", "ParticipantsGalleryView.unsetParticipantState: null participant");
            return;
        }
        if (a)
        {
            Throwable throwable = new Throwable();
            String s1 = String.valueOf(cfz1.b.b);
            a(throwable, ((OverlayedAvatarView) (null)), (new StringBuilder(String.valueOf(s1).length() + 47)).append("--- unsetParticipantState ").append(s1).append(" unsetBit=").append(i1).toString());
        }
        a(((ejj) (new ejh(cfz1, i1, false, flag))));
    }

    public void a(ecj ecj1)
    {
        d = ecj1;
    }

    public void a(ejf ejf1)
    {
        g = ejf1;
    }

    public void a(List list, boolean flag)
    {
        if (a)
        {
            Throwable throwable = new Throwable();
            String s1 = String.valueOf(a(list));
            if (s1.length() != 0)
            {
                s1 = "--- UnsetWatermarkBatch ".concat(s1);
            } else
            {
                s1 = new String("--- UnsetWatermarkBatch ");
            }
            a(throwable, ((OverlayedAvatarView) (null)), s1);
        }
        a(((ejj) (new eje(list, false, flag))));
    }

    public boolean a(cgd cgd1)
    {
        eec eec1 = n;
        eec1;
        JVM INSTR monitorenter ;
        cgd1 = (OverlayedAvatarView)n.get(cgd1);
        if (cgd1 == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        boolean flag;
        if (cgd1.d() || cgd1.e())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        eec1;
        JVM INSTR monitorexit ;
        return flag;
        eec1;
        JVM INSTR monitorexit ;
        return false;
        cgd1;
        eec1;
        JVM INSTR monitorexit ;
        throw cgd1;
    }

    public void b()
    {
        g();
    }

    public void b(int i1)
    {
        if (j != i1)
        {
            j = i1;
            for (int j1 = 0; j1 < k.getChildCount(); j1++)
            {
                if (k.getChildAt(j1) instanceof OverlayedAvatarView)
                {
                    ((OverlayedAvatarView)k.getChildAt(j1)).g(i1);
                }
            }

        }
    }

    public void b(List list, boolean flag)
    {
        if (a)
        {
            Throwable throwable = new Throwable();
            String s1 = String.valueOf(a(list));
            if (s1.length() != 0)
            {
                s1 = "+++ SetWatermarkBatch ".concat(s1);
            } else
            {
                s1 = new String("+++ SetWatermarkBatch ");
            }
            a(throwable, ((OverlayedAvatarView) (null)), s1);
        }
        a(new eje(list, true, flag));
    }

    public void c(int i1)
    {
        q = i1;
        eec eec1 = n;
        eec1;
        JVM INSTR monitorenter ;
        Iterator iterator = n.values().iterator();
_L1:
        OverlayedAvatarView overlayedavatarview;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_77;
        }
        overlayedavatarview = (OverlayedAvatarView)iterator.next();
        Exception exception;
        boolean flag;
        if (q == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        overlayedavatarview.a(flag);
          goto _L1
        exception;
        eec1;
        JVM INSTR monitorexit ;
        throw exception;
        eec1;
        JVM INSTR monitorexit ;
        g();
        return;
    }

    public boolean c()
    {
        return p;
    }

    public void d()
    {
        eec eec1 = n;
        eec1;
        JVM INSTR monitorenter ;
        for (Iterator iterator = n.values().iterator(); iterator.hasNext(); ((OverlayedAvatarView)iterator.next()).f()) { }
        break MISSING_BLOCK_LABEL_49;
        Exception exception;
        exception;
        eec1;
        JVM INSTR monitorexit ;
        throw exception;
        int i1;
        n.clear();
        h();
        l = 0;
        m = 0;
        if (!a)
        {
            break MISSING_BLOCK_LABEL_142;
        }
        i1 = k.getChildCount();
        Object obj;
        Exception exception1;
        if (b)
        {
            obj = "focus gallery.";
        } else
        {
            obj = "watermarks.";
        }
        eev.b("Babel", (new StringBuilder(String.valueOf(obj).length() + 48)).append("[PartGallery] Removing ").append(i1).append(" view(s) from ").append(((String) (obj))).toString());
        k.removeAllViews();
        s.removeMessages(0);
        t.clear();
        u = false;
        p = true;
        eec1;
        JVM INSTR monitorexit ;
        g();
        obj = o;
        obj;
        JVM INSTR monitorenter ;
        for (Iterator iterator1 = o.values().iterator(); iterator1.hasNext(); removeCallbacks((Runnable)iterator1.next())) { }
        break MISSING_BLOCK_LABEL_240;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
        o.clear();
        obj;
        JVM INSTR monitorexit ;
        if (a)
        {
            a(((Throwable) (null)), ((OverlayedAvatarView) (null)), "================ Switch Conversation ================");
        }
        return;
    }

    public void e()
    {
        b = true;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        d();
    }

    static 
    {
        hnc hnc = eev.w;
    }
}
