// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.views;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import aqj;
import are;
import cao;
import ceu;
import cey;
import czn;
import dyy;
import ebr;
import ebw;
import efq;
import egd;
import g;
import h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.hangouts.views:
//            ParticipantsGalleryView, MessageListAnimationManager

public class MessageListItemWrapperView extends LinearLayout
    implements dyy, egd
{

    private static final boolean a = false;
    private static int b = -1;
    private static int c = -1;
    private static int d;
    private static boolean z = false;
    private boolean A;
    private cao e;
    private efq f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private boolean o;
    private int p;
    private ParticipantsGalleryView q;
    private FrameLayout r;
    private Space s;
    private String t;
    private long u;
    private boolean v;
    private MessageListAnimationManager w;
    private boolean x;
    private boolean y;

    public MessageListItemWrapperView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        l = -1;
        x = false;
        y = false;
        A = false;
        b(0);
        setClipToPadding(false);
        d = getResources().getInteger(g.fc);
    }

    static int a(Resources resources)
    {
        return c(resources);
    }

    public static int a(MessageListItemWrapperView messagelistitemwrapperview)
    {
        return messagelistitemwrapperview.l;
    }

    public static int a(MessageListItemWrapperView messagelistitemwrapperview, int i1)
    {
        messagelistitemwrapperview.k = i1;
        return i1;
    }

    private boolean a(long l1, long l2, aqj aqj1, are are1)
    {
        if (v)
        {
            return false;
        }
        for (are1 = are1.a(l1, l2).iterator(); are1.hasNext();)
        {
            cey cey1 = ((czn)are1.next()).d;
            if (!aqj1.b(cey1))
            {
                ceu ceu1 = aqj1.a(cey1);
                if (ceu1 == null)
                {
                    return true;
                }
                if (ceu1 != null && !aqj1.c(cey1))
                {
                    return true;
                }
            }
        }

        return false;
    }

    private static boolean a(List list, List list1)
    {
        if (list.size() == list1.size()) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int i1 = 0;
label0:
        do
        {
label1:
            {
                if (i1 >= list.size())
                {
                    break label1;
                }
                if (!((ceu)list.get(i1)).b.a(((ceu)list1.get(i1)).b))
                {
                    break label0;
                }
                i1++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    private static int b(Resources resources)
    {
        if (c == -1)
        {
            c = resources.getDimensionPixelSize(g.ex);
        }
        return c;
    }

    public static int b(MessageListItemWrapperView messagelistitemwrapperview, int i1)
    {
        messagelistitemwrapperview.l = i1;
        return i1;
    }

    public static String b(MessageListItemWrapperView messagelistitemwrapperview)
    {
        return messagelistitemwrapperview.t;
    }

    private static int c(Resources resources)
    {
        if (b == -1)
        {
            b = resources.getDimensionPixelSize(g.eB);
        }
        return b;
    }

    public static efq c(MessageListItemWrapperView messagelistitemwrapperview)
    {
        return messagelistitemwrapperview.f;
    }

    public static void c(boolean flag)
    {
        z = flag;
    }

    public static MessageListAnimationManager d(MessageListItemWrapperView messagelistitemwrapperview)
    {
        return messagelistitemwrapperview.w;
    }

    private void e(boolean flag)
    {
        boolean flag1 = l();
        if (flag || flag1)
        {
            k = 0;
            return;
        } else
        {
            k = c(getResources());
            return;
        }
    }

    static int i()
    {
        return d;
    }

    private void j()
    {
        setPadding(getPaddingLeft(), m, getPaddingRight(), n);
    }

    private void k()
    {
        SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder();
        CharSequence charsequence = e.b().getContentDescription();
        if (!TextUtils.isEmpty(charsequence))
        {
            spannablestringbuilder.append(charsequence);
        }
        charsequence = q.getContentDescription();
        if (!TextUtils.isEmpty(charsequence))
        {
            if (spannablestringbuilder.length() > 0)
            {
                spannablestringbuilder.append(", ");
            }
            spannablestringbuilder.append(charsequence);
        }
        setContentDescription(spannablestringbuilder);
    }

    private boolean l()
    {
        return v && z;
    }

    public int a(float f1)
    {
        if (a)
        {
            ebw.b("Babel", (new StringBuilder(44)).append("setRevealAnimationPercentage ").append(f1).toString());
        }
        int i1 = b(getResources());
        int j1 = g;
        int k1 = getPaddingTop();
        int l1 = getPaddingBottom();
        int i2 = k;
        int j2 = j;
        int k2 = h;
        j = (int)((float)(((j1 - k1 - l1) + i1) - i2 - h) * f1) + k2;
        m = (int)((1.0F - f1) * (float)i);
        n = (int)((float)i1 * f1);
        j();
        return j - j2;
    }

    public void a()
    {
    }

    public void a(int i1)
    {
        q.b(i1);
    }

    public void a(Cursor cursor, aqj aqj1, int i1, are are1)
    {
        long l6;
        boolean flag2;
        long l1 = cursor.getLong(0);
        if (u != l1)
        {
            f();
        }
        u = l1;
        t = cursor.getString(1);
        v = cursor.isLast();
        flag2 = cursor.isFirst();
        long l4;
        boolean flag;
        if (v)
        {
            w.a(this);
        } else
        if (w.b() == this)
        {
            w.a(null);
        }
        q.c(i1);
        l6 = cursor.getLong(6);
        l4 = 0x7fffffffffffffffL;
        l1 = l4;
        if (!v)
        {
            l1 = l4;
            if (cursor.moveToNext())
            {
                l1 = cursor.getLong(6);
                cursor.moveToPrevious();
            }
        }
        flag = false;
        if (!A)
        {
            flag = a(l6, l1, aqj1, are1);
            ArrayList arraylist = new ArrayList();
            if (flag)
            {
                for (Iterator iterator = are1.a(l6, l1).iterator(); iterator.hasNext();)
                {
                    czn czn1 = (czn)iterator.next();
                    if (a)
                    {
                        String s1 = String.valueOf("[MessageListItem#bind] Associated watermark found for messageId ");
                        String s2 = t;
                        ebw.b("Babel", (new StringBuilder(String.valueOf(s1).length() + 36 + String.valueOf(s2).length())).append(s1).append(s2).append(" with timestamp ").append(l6).toString());
                        s1 = String.valueOf(czn1.d);
                        long l2 = czn1.e;
                        ebw.b("Babel", (new StringBuilder(String.valueOf(s1).length() + 43)).append("  gaiaId: ").append(s1).append("  timestamp: ").append(l2).toString());
                    }
                    Object obj = czn1.d;
                    if (!aqj1.b(((cey) (obj))))
                    {
                        ceu ceu1 = aqj1.a(((cey) (obj)));
                        boolean flag3 = aqj1.c(((cey) (obj)));
                        if (a)
                        {
                            String s3 = String.valueOf(obj);
                            String s6 = t;
                            ebw.b("Babel", (new StringBuilder(String.valueOf(s3).length() + 31 + String.valueOf(s6).length())).append("Have watermark for ").append(s3).append(" on message ").append(s6).toString());
                            if (flag3)
                            {
                                String s4 = String.valueOf(obj);
                                ebw.b("Babel", (new StringBuilder(String.valueOf(s4).length() + 30)).append("  ").append(s4).append(" is focused; Hide watermark.").toString());
                            }
                            if (ceu1 == null)
                            {
                                String s5 = String.valueOf(obj);
                                ebw.b("Babel", (new StringBuilder(String.valueOf(s5).length() + 42)).append("  ").append(s5).append(" not in participant map; Hide watermark.").toString());
                            }
                            if (v)
                            {
                                obj = String.valueOf(obj);
                                ebw.b("Babel", (new StringBuilder(String.valueOf(obj).length() + 38)).append("  ").append(((String) (obj))).append(" is on last message; Hide watermark.").toString());
                            }
                        }
                        if (ceu1 != null && !flag3)
                        {
                            arraylist.add(ceu1);
                        }
                    }
                }

            }
            List list = f.c(t);
            f.a(t, arraylist);
            if (list != null && list.size() > 0)
            {
                q.b(list, false);
                if (arraylist.size() > 0)
                {
                    if (!a(((List) (arraylist)), list))
                    {
                        ArrayList arraylist1 = new ArrayList(list);
                        arraylist1.removeAll(arraylist);
                        arraylist = new ArrayList(arraylist);
                        arraylist.removeAll(list);
                        if (arraylist.size() > 0)
                        {
                            q.b(arraylist, true);
                        }
                        if (arraylist1.size() > 0)
                        {
                            q.a(arraylist1, true);
                        }
                    }
                } else
                {
                    q.a(list, false);
                }
            } else
            if (arraylist.size() > 0)
            {
                q.b(arraylist, false);
            }
        }
        n = 0;
        m = 0;
        p;
        JVM INSTR tableswitch 0 4: default 884
    //                   0 1088
    //                   1 943
    //                   2 1096
    //                   3 1107
    //                   4 1107;
           goto _L1 _L2 _L3 _L4 _L5 _L5
_L1:
        break; /* Loop/switch isn't completed */
_L5:
        break MISSING_BLOCK_LABEL_1107;
_L6:
        j();
        long l3;
        long l5;
        boolean flag1;
        if (!flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        a(flag1);
        k();
        return;
_L3:
        if (!x)
        {
            x = true;
            i = b(getResources());
            l5 = 0L;
            l3 = l5;
            if (!flag2)
            {
                l3 = l5;
                if (cursor.moveToPrevious())
                {
                    l3 = cursor.getLong(6);
                    cursor.moveToNext();
                }
            }
            if (!a(l3, l6, aqj1, are1) && z)
            {
                i = i + c(getResources());
            }
            m = i;
            h = i;
            j = h;
            ebr.a(this, null, e.b().getContentDescription());
        }
          goto _L6
_L2:
        j = 0;
          goto _L6
_L4:
        n = b(getResources());
        j = -1;
          goto _L6
    }

    public void a(cao cao1)
    {
        e = cao1;
        r.removeAllViews();
        r.addView(e.b());
    }

    public void a(MessageListAnimationManager messagelistanimationmanager)
    {
        w = messagelistanimationmanager;
    }

    public void a(efq efq1)
    {
        f = efq1;
    }

    public void a(boolean flag)
    {
        y = flag;
        h();
    }

    public void b()
    {
        k();
    }

    public void b(int i1)
    {
        p = i1;
    }

    public void b(boolean flag)
    {
        A = flag;
    }

    public cao c()
    {
        return e;
    }

    public void d()
    {
        ebw.a("Babel", "onNewMessageAnimationEnded");
        p = 4;
    }

    public void d(boolean flag)
    {
        Space space = s;
        int i1;
        if (flag)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        space.setVisibility(i1);
    }

    public long e()
    {
        return u;
    }

    public void f()
    {
        setTranslationX(0.0F);
        o = false;
        q.d();
        x = false;
    }

    public long g()
    {
        return e.a();
    }

    public void h()
    {
        boolean flag2 = true;
        boolean flag1 = true;
        int j1;
        if (f.b(t))
        {
            j1 = f.a(t);
        } else
        {
            j1 = 0;
        }
        if (j1 == 4)
        {
            return;
        }
        int i1;
        if (A)
        {
            i1 = 1;
        } else
        if (l())
        {
            i1 = 3;
        } else
        if (y)
        {
            i1 = 1;
        } else
        {
            i1 = 2;
        }
        if (j1 == i1)
        {
            if (i1 == 1)
            {
                flag1 = false;
            }
            e(flag1);
            return;
        }
        boolean flag;
        if (efq.a(i1) && efq.a(j1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (j1 != 0 && j1 != 3 && j1 != 4 && !flag)
        {
            f.a(t, 4);
            post(new WatermarkGalleryStateTransition(this, i1));
            return;
        }
        f.a(t, i1);
        if (i1 != 1)
        {
            flag1 = flag2;
        } else
        {
            flag1 = false;
        }
        e(flag1);
    }

    public void onFinishInflate()
    {
        r = (FrameLayout)findViewById(h.dL);
        q = (ParticipantsGalleryView)findViewById(h.gZ);
        q.a(this);
        q.a(this);
        s = (Space)findViewById(h.Z);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
    {
        super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
        if (TextUtils.isEmpty(accessibilitynodeinfo.getText()))
        {
            accessibilitynodeinfo.setText(accessibilitynodeinfo.getContentDescription());
        }
    }

    protected void onMeasure(int i1, int j1)
    {
        super.onMeasure(i1, j1);
        g = getMeasuredHeight();
        if (p != 4 && p == 1 && w != null && !o)
        {
            w.b(this);
            o = true;
        }
        if (j >= 0)
        {
            i1 = j;
        } else
        if (A)
        {
            i1 = g - c(getResources());
        } else
        {
            if (l >= 0)
            {
                i1 = l;
            } else
            {
                i1 = k;
            }
            i1 = g - i1;
        }
        setMeasuredDimension(getMeasuredWidth(), i1);
    }

    static 
    {
        hik hik = ebw.w;
    }

    private class WatermarkGalleryStateTransition
        implements Runnable
    {

        public final MessageListItemWrapperView a;
        private final int b;
        private MessageListView c;
        private ObjectAnimator d;
        private final View e;
        private int f;
        private int g;
        private int h;
        private boolean i;
        private int j;
        private int k;

        public static int a(WatermarkGalleryStateTransition watermarkgallerystatetransition)
        {
            return watermarkgallerystatetransition.b;
        }

        public void run()
        {
            efc efc1;
            if (b == 1)
            {
                j = 0;
                k = MessageListItemWrapperView.a(a.getResources());
            } else
            {
                j = MessageListItemWrapperView.a(a.getResources());
                k = 0;
            }
            d = ObjectAnimator.ofInt(this, "watermarkGalleryMeasuredHeightReduction", new int[] {
                j, k
            });
            d.setDuration(MessageListItemWrapperView.i());
            d.setInterpolator(new aia());
            d.addListener(new efr(this));
            efc1 = MessageListItemWrapperView.d(a).a();
            if (efc1 != null)
            {
                efc1.a();
            }
            d.start();
        }

        public void setWatermarkGalleryMeasuredHeightReduction(int i1)
        {
            MessageListItemWrapperView.b(a, i1);
            if (c == null)
            {
                c = (MessageListView)e.getParent();
            }
            boolean flag;
            if (c == null)
            {
                d.cancel();
                flag = false;
            } else
            {
                if (!i)
                {
                    h = e.getTop();
                    g = c.getHeight();
                    f = c.getPositionForView(e);
                    i = true;
                }
                flag = true;
            }
            if (!flag)
            {
                return;
            } else
            {
                int j1 = j;
                int k1 = h;
                int l1 = g;
                int i2 = c.getHeight();
                c.a(f, k1 - (j1 - i1) - (l1 - i2));
                a.requestLayout();
                return;
            }
        }

        public WatermarkGalleryStateTransition(View view, int i1)
        {
            a = MessageListItemWrapperView.this;
            super();
            b = i1;
            e = view;
        }
    }

}
