// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Rect;
import android.view.View;

public final class mq
{

    private static final mv a;
    private final Object b;

    public mq(Object obj)
    {
        b = obj;
    }

    public static mq a(mq mq1)
    {
        mq1 = ((mq) (a.a(mq1.b)));
        if (mq1 != null)
        {
            return new mq(mq1);
        } else
        {
            return null;
        }
    }

    public static mv o()
    {
        return a;
    }

    public Object a()
    {
        return b;
    }

    public void a(int i1)
    {
        a.a(b, i1);
    }

    public void a(Rect rect)
    {
        a.a(b, rect);
    }

    public void a(View view)
    {
        a.c(b, view);
    }

    public void a(CharSequence charsequence)
    {
        a.c(b, charsequence);
    }

    public void a(Object obj)
    {
        a.b(b, ((na)obj).a);
    }

    public void a(boolean flag)
    {
        a.c(b, flag);
    }

    public boolean a(mr mr1)
    {
        return a.a(b, mr.a(mr1));
    }

    public int b()
    {
        return a.b(b);
    }

    public void b(Rect rect)
    {
        a.c(b, rect);
    }

    public void b(View view)
    {
        a.a(b, view);
    }

    public void b(CharSequence charsequence)
    {
        a.a(b, charsequence);
    }

    public void b(Object obj)
    {
        a.c(b, ((nb)obj).a);
    }

    public void b(boolean flag)
    {
        a.d(b, flag);
    }

    public void c(Rect rect)
    {
        a.b(b, rect);
    }

    public void c(View view)
    {
        a.b(b, view);
    }

    public void c(CharSequence charsequence)
    {
        a.b(b, charsequence);
    }

    public void c(boolean flag)
    {
        a.h(b, flag);
    }

    public boolean c()
    {
        return a.k(b);
    }

    public void d(Rect rect)
    {
        a.d(b, rect);
    }

    public void d(boolean flag)
    {
        a.i(b, flag);
    }

    public boolean d()
    {
        return a.l(b);
    }

    public void e(boolean flag)
    {
        a.g(b, flag);
    }

    public boolean e()
    {
        return a.r(b);
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        obj = (mq)obj;
        if (b != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((mq) (obj)).b == null) goto _L1; else goto _L3
_L3:
        return false;
        if (b.equals(((mq) (obj)).b)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public void f(boolean flag)
    {
        a.a(b, flag);
    }

    public boolean f()
    {
        return a.s(b);
    }

    public void g(boolean flag)
    {
        a.e(b, flag);
    }

    public boolean g()
    {
        return a.p(b);
    }

    public void h(boolean flag)
    {
        a.b(b, flag);
    }

    public boolean h()
    {
        return a.i(b);
    }

    public int hashCode()
    {
        if (b == null)
        {
            return 0;
        } else
        {
            return b.hashCode();
        }
    }

    public void i(boolean flag)
    {
        a.f(b, flag);
    }

    public boolean i()
    {
        return a.m(b);
    }

    public boolean j()
    {
        return a.j(b);
    }

    public CharSequence k()
    {
        return a.e(b);
    }

    public CharSequence l()
    {
        return a.c(b);
    }

    public CharSequence m()
    {
        return a.d(b);
    }

    public void n()
    {
        a.q(b);
    }

    public String toString()
    {
        StringBuilder stringbuilder;
        int i1;
        stringbuilder = new StringBuilder();
        stringbuilder.append(super.toString());
        Rect rect = new Rect();
        a(rect);
        stringbuilder.append((new StringBuilder("; boundsInParent: ")).append(rect).toString());
        c(rect);
        stringbuilder.append((new StringBuilder("; boundsInScreen: ")).append(rect).toString());
        stringbuilder.append("; packageName: ").append(k());
        stringbuilder.append("; className: ").append(l());
        stringbuilder.append("; text: ").append(a.f(b));
        stringbuilder.append("; contentDescription: ").append(m());
        stringbuilder.append("; viewId: ").append(a.t(b));
        stringbuilder.append("; checkable: ").append(a.g(b));
        stringbuilder.append("; checked: ").append(a.h(b));
        stringbuilder.append("; focusable: ").append(c());
        stringbuilder.append("; focused: ").append(d());
        stringbuilder.append("; selected: ").append(g());
        stringbuilder.append("; clickable: ").append(h());
        stringbuilder.append("; longClickable: ").append(i());
        stringbuilder.append("; enabled: ").append(j());
        stringbuilder.append("; password: ").append(a.n(b));
        stringbuilder.append((new StringBuilder("; scrollable: ")).append(a.o(b)).toString());
        stringbuilder.append("; [");
        i1 = b();
_L24:
        if (i1 == 0) goto _L2; else goto _L1
_L1:
        int j1;
        j1 = 1 << Integer.numberOfTrailingZeros(i1);
        i1 = ~j1 & i1;
        j1;
        JVM INSTR lookupswitch 18: default 528
    //                   1: 553
    //                   2: 560
    //                   4: 567
    //                   8: 574
    //                   16: 581
    //                   32: 588
    //                   64: 595
    //                   128: 602
    //                   256: 609
    //                   512: 616
    //                   1024: 623
    //                   2048: 630
    //                   4096: 637
    //                   8192: 644
    //                   16384: 658
    //                   32768: 665
    //                   65536: 651
    //                   131072: 672;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21
_L3:
        String s = "ACTION_UNKNOWN";
_L22:
        stringbuilder.append(s);
        if (i1 != 0)
        {
            stringbuilder.append(", ");
        }
        continue; /* Loop/switch isn't completed */
_L4:
        s = "ACTION_FOCUS";
        continue; /* Loop/switch isn't completed */
_L5:
        s = "ACTION_CLEAR_FOCUS";
        continue; /* Loop/switch isn't completed */
_L6:
        s = "ACTION_SELECT";
        continue; /* Loop/switch isn't completed */
_L7:
        s = "ACTION_CLEAR_SELECTION";
        continue; /* Loop/switch isn't completed */
_L8:
        s = "ACTION_CLICK";
        continue; /* Loop/switch isn't completed */
_L9:
        s = "ACTION_LONG_CLICK";
        continue; /* Loop/switch isn't completed */
_L10:
        s = "ACTION_ACCESSIBILITY_FOCUS";
        continue; /* Loop/switch isn't completed */
_L11:
        s = "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
        continue; /* Loop/switch isn't completed */
_L12:
        s = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
        continue; /* Loop/switch isn't completed */
_L13:
        s = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
        continue; /* Loop/switch isn't completed */
_L14:
        s = "ACTION_NEXT_HTML_ELEMENT";
        continue; /* Loop/switch isn't completed */
_L15:
        s = "ACTION_PREVIOUS_HTML_ELEMENT";
        continue; /* Loop/switch isn't completed */
_L16:
        s = "ACTION_SCROLL_FORWARD";
        continue; /* Loop/switch isn't completed */
_L17:
        s = "ACTION_SCROLL_BACKWARD";
        continue; /* Loop/switch isn't completed */
_L20:
        s = "ACTION_CUT";
        continue; /* Loop/switch isn't completed */
_L18:
        s = "ACTION_COPY";
        continue; /* Loop/switch isn't completed */
_L19:
        s = "ACTION_PASTE";
        continue; /* Loop/switch isn't completed */
_L21:
        s = "ACTION_SET_SELECTION";
        if (true) goto _L22; else goto _L2
_L2:
        stringbuilder.append("]");
        return stringbuilder.toString();
        if (true) goto _L24; else goto _L23
_L23:
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 22)
        {
            a = new mt();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            a = new ms();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            a = new mz();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 18)
        {
            a = new my();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            a = new mx();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            a = new mw();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            a = new mu();
        } else
        {
            a = new mv();
        }
    }
}
