// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import com.google.android.apps.hangouts.views.HangoutEventMessageListItemView;
import com.google.android.apps.hangouts.views.MessageListAnimationManager;
import com.google.android.apps.hangouts.views.MessageListItemView;
import com.google.android.apps.hangouts.views.MessageListItemWrapperView;
import com.google.android.apps.hangouts.views.OtrModificationMessageListItemView;
import com.google.android.apps.hangouts.views.SystemMessageListItemView;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class aqd extends cng
{

    public static final boolean j = false;
    public static long k;
    private final bhp l;
    private final efd m;
    private final MessageListAnimationManager n;
    private aqh o;
    private int p;
    private boolean q;
    private boolean r;
    private long s;
    private final efq t = new aqi();

    public aqd(bhp bhp1, AbsListView abslistview, MessageListAnimationManager messagelistanimationmanager, int i, boolean flag)
    {
        super(bhp1.getActivity(), null);
        s = 0x7fffffffffffffffL;
        if (k == -1L)
        {
            k = g.a(g.nS, "babel_message_block_max_time_diff_ms", 0x2bf20L);
        }
        l = bhp1;
        p = i;
        m = new efd(flag);
        n = messagelistanimationmanager;
        n.a(m);
        abslistview.setRecyclerListener(new aqe(this));
    }

    static bhp a(aqd aqd1)
    {
        return aqd1.l;
    }

    private cao a(cao cao1)
    {
        for (Iterator iterator = hgx.c(d, aqk).iterator(); iterator.hasNext();)
        {
            aqk aqk1 = (aqk)iterator.next();
            if (aqk1.a())
            {
                return aqk1.a(cao1);
            }
        }

        return null;
    }

    private boolean a(boolean flag, boolean flag1)
    {
        boolean flag2;
label0:
        {
label1:
            {
                boolean flag4 = false;
                boolean flag3 = false;
                long l1 = c.getLong(6);
                String s1 = c.getString(4);
                String s2 = c.getString(3);
                dqc dqc1 = dqc.values()[c.getInt(8)];
                dqb dqb1 = dqb.values()[c.getInt(7)];
                int i = c.getInt(36);
                flag2 = flag4;
                if (c.isLast())
                {
                    break label0;
                }
                flag2 = flag4;
                if (!c.moveToNext())
                {
                    break label0;
                }
                long l2 = c.getLong(6);
                String s3 = c.getString(4);
                String s4 = c.getString(3);
                dqc dqc2 = dqc.values()[c.getInt(8)];
                dqb dqb2 = dqb.values()[c.getInt(7)];
                int i1 = c.getInt(36);
                if (flag1)
                {
                    flag1 = flag3;
                    if (l2 - l1 >= k)
                    {
                        break label1;
                    }
                }
                flag1 = flag3;
                if (i1 != i)
                {
                    break label1;
                }
                if (flag)
                {
                    flag1 = flag3;
                    if (dqc1 != dqc2)
                    {
                        break label1;
                    }
                    flag1 = flag3;
                    if (!cey.a(s2, s1, s4, s3))
                    {
                        break label1;
                    }
                }
                flag1 = flag3;
                if (dqb1 == dqb.e)
                {
                    flag1 = flag3;
                    if (dqb2 != dqb.d)
                    {
                        flag1 = flag3;
                        if (dqb2 != dqb.b)
                        {
                            flag1 = true;
                        }
                    }
                }
            }
            c.moveToPrevious();
            flag2 = flag1;
        }
        return flag2;
    }

    public void a(long l1)
    {
        m.a(l1);
    }

    public void a(aqh aqh1)
    {
        o = aqh1;
    }

    public void a(boolean flag)
    {
        r = flag;
    }

    public Cursor b(Cursor cursor)
    {
        m.a(cursor);
        return super.b(cursor);
    }

    public void b(boolean flag)
    {
        m.a(flag);
    }

    public void c()
    {
        ani ani1 = l.a();
        String s1 = l.O();
        if (s != 0x7fffffffffffffffL && ani1 != null && !TextUtils.isEmpty(s1))
        {
            ebw.a("Babel", "Update message scroll time");
            RealTimeChatService.c(l.a(), l.O(), s);
            s = 0x7fffffffffffffffL;
            return;
        } else
        {
            ebw.a("Babel", "Skip updating message scroll time");
            return;
        }
    }

    public void c(boolean flag)
    {
        q = flag;
    }

    public void d_()
    {
        m.a();
    }

    public int getItemViewType(int i)
    {
        c.moveToPosition(i);
        return c.getInt(8);
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        Object obj;
        Object obj1;
        int i1;
        if (!a)
        {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!c.moveToPosition(i))
        {
            throw new IllegalStateException((new StringBuilder(44)).append("couldn't move cursor to position ").append(i).toString());
        }
        viewgroup = c.getString(10);
        obj = c.getString(9);
        cao cao1;
        long l1;
        boolean flag;
        try
        {
            if (!TextUtils.isEmpty(viewgroup))
            {
                Uri.parse(viewgroup).getHost().hashCode();
            }
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                Uri.parse(((String) (obj))).getHost().hashCode();
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            ebw.e("Babel", (new StringBuilder(String.valueOf(viewgroup).length() + 53 + String.valueOf(obj).length())).append(" Read message info with malformed url: remote=").append(viewgroup).append(" local=").append(((String) (obj))).toString(), ((Throwable) (obj1)));
        }
        l1 = c.getLong(6);
        if (s > l1)
        {
            s = l1;
        }
        viewgroup = (LayoutInflater)d.getSystemService("layout_inflater");
        obj1 = dqc.values()[c.getInt(8)];
        if (view != null)
        {
            view = (MessageListItemWrapperView)view;
        } else
        {
            view = (MessageListItemWrapperView)viewgroup.inflate(g.gL, null);
            view.a(n);
            view.a(t);
        }
        view.b(r);
        if (c.getLong(19) != 0L)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            i1 = 1;
        } else
        {
            i1 = 2;
        }
        view.a(i1);
        l1 = getItemId(i);
        obj = m.b();
        flag = m.c(l1);
        if (obj != null && l1 == g.a(((Long) (obj)), 0L))
        {
            i1 = 1;
        } else
        if (m.b(l1))
        {
            i1 = 0;
        } else
        if (flag)
        {
            if (obj != null)
            {
                i1 = 3;
            } else
            {
                i1 = 2;
            }
        } else
        {
            i1 = 4;
        }
        view.b(i1);
        obj = view.c();
        cao1 = a(((cao) (obj)));
        if (cao1 == null) goto _L2; else goto _L1
_L1:
        view.a(cao1);
_L13:
        viewgroup = (ard)hgx.a(d, ard);
        view.a(c, l, p, viewgroup.a(l.O()));
        return view;
_L2:
        if (obj1 != dqc.c && obj1 != dqc.b)
        {
            break MISSING_BLOCK_LABEL_893;
        }
        long l2;
        boolean flag1;
        boolean flag2;
        if (obj != null)
        {
            viewgroup = (MessageListItemView)((cao) (obj)).b();
        } else
        {
            obj = dqc.values()[getItemViewType(i)];
            if (obj == dqc.b || obj == dqc.c)
            {
                i = g.gK;
            } else
            {
                i = -1;
            }
            obj = (MessageListItemView)viewgroup.inflate(i, null);
            ((MessageListItemView) (obj)).a(l);
            ((MessageListItemView) (obj)).a(l);
            view.a(((cao) (obj)));
            viewgroup = ((ViewGroup) (obj));
            if (o != null)
            {
                o.a(((MessageListItemView) (obj)));
                viewgroup = ((ViewGroup) (obj));
            }
        }
        if (obj1 == dqc.b)
        {
            viewgroup.a(l.a().x());
        }
        viewgroup.a(c, p, l.a(), l, q);
        l2 = c.getLong(0);
        viewgroup.setSelected(l.a(l2));
        if (p != 1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flag1 = a(flag1, true);
        if (!a(true, false))
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        view.d(flag2);
        dqb dqb1;
        if (!c.isFirst() && c.moveToPrevious())
        {
            flag2 = a(true, false);
            c.moveToNext();
        } else
        {
            flag2 = false;
        }
        i1;
        JVM INSTR tableswitch 3 4: default 716
    //                   3 870
    //                   4 861;
           goto _L3 _L4 _L5
_L4:
        break MISSING_BLOCK_LABEL_870;
_L3:
        viewgroup.b(false);
        flag1 = false;
_L6:
        viewgroup.a(flag1);
        if (!flag2)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        viewgroup.c(flag1);
        viewgroup.requestLayout();
        continue; /* Loop/switch isn't completed */
_L5:
        viewgroup.b(flag1);
          goto _L6
        viewgroup.b(false);
        if (flag1)
        {
            viewgroup.u();
        }
          goto _L6
        if (obj1 == dqc.h || obj1 == dqc.i)
        {
            if (obj != null)
            {
                viewgroup = (HangoutEventMessageListItemView)((cao) (obj)).b();
            } else
            {
                viewgroup = (HangoutEventMessageListItemView)viewgroup.inflate(g.fY, null);
                view.a(viewgroup);
            }
            l2 = c.getLong(6) / 1000L;
            obj1 = dqc.values()[c.getInt(8)];
            dqb1 = dqb.values()[c.getInt(7)];
            obj = c.getString(35);
            i = c.getInt(38);
            obj1 = g.a(((dqc) (obj1)), l.a(), dqb1, c.getString(4), c.getString(3), c.getString(34), ((String) (obj)), i, false);
            obj = g.a(l.a(), ((String) (obj)), false);
            viewgroup.a(((CharSequence) (obj1)), l2, l.a(), ((List) (obj)), i);
            viewgroup.c();
            continue; /* Loop/switch isn't completed */
        }
        if (obj1 == dqc.j || obj1 == dqc.k)
        {
            if (obj != null)
            {
                viewgroup = (OtrModificationMessageListItemView)((cao) (obj)).b();
            } else
            {
                viewgroup = (OtrModificationMessageListItemView)viewgroup.inflate(g.gQ, null);
                view.a(viewgroup);
            }
            l2 = c.getLong(6) / 1000L;
            obj1 = dqc.values()[c.getInt(8)];
            obj = dqb.values()[c.getInt(7)];
            if (obj1 == dqc.j)
            {
                i = 1;
            } else
            {
                i = 2;
            }
            obj1 = new cey(c.getString(4), c.getString(3));
            flag1 = l.b(((cey) (obj1)));
            viewgroup.a(i, ((dqb) (obj)), l.e(((cey) (obj1))), flag1);
            viewgroup.a(l2);
            viewgroup.c();
            continue; /* Loop/switch isn't completed */
        }
        if (obj1 == dqc.a || obj1 == dqc.r)
        {
            if (obj != null)
            {
                viewgroup = (byd)((cao) (obj)).b();
            } else
            {
                viewgroup = ((byf)hgx.a(d, byf)).b(d);
                view.a(viewgroup);
            }
            if (viewgroup != null)
            {
                flag1 = ((dqc) (obj1)).equals(dqc.r);
                l2 = c.getLong(6) / 1000L;
                obj = c.getString(1);
                obj1 = c.getString(5);
                viewgroup.a(l2, ((String) (obj)));
                viewgroup.a(new aqf(this, flag1, ((String) (obj1))));
            }
            continue; /* Loop/switch isn't completed */
        }
        if (obj != null)
        {
            viewgroup = (SystemMessageListItemView)((cao) (obj)).b();
        } else
        {
            viewgroup = (SystemMessageListItemView)viewgroup.inflate(g.hf, null);
            view.a(viewgroup);
        }
        l2 = c.getLong(6) / 1000L;
        obj = dqc.values()[c.getInt(8)];
        obj1 = dqb.values()[c.getInt(7)];
        if (obj == dqc.f || obj == dqc.p || obj == dqc.n || obj1 == dqb.d)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        viewgroup.a(flag1);
        viewgroup.a(g.a(((dqc) (obj)), l.a(), ((dqb) (obj1)), c.getString(4), c.getString(3), c.getString(34), c.getString(35), c.getInt(38), false));
        viewgroup.a(l2);
        aqg.a[((dqc) (obj)).ordinal()];
        JVM INSTR tableswitch 1 5: default 1680
    //                   1 1722
    //                   2 1729
    //                   3 1729
    //                   4 1736
    //                   5 1743;
           goto _L7 _L8 _L9 _L9 _L10 _L11
_L11:
        break MISSING_BLOCK_LABEL_1743;
_L8:
        break; /* Loop/switch isn't completed */
_L7:
        i = com.google.android.apps.hangouts.R.drawable.ce;
_L14:
        viewgroup.a(i);
        viewgroup.c();
        if (true) goto _L13; else goto _L12
_L12:
        i = com.google.android.apps.hangouts.R.drawable.cq;
          goto _L14
_L9:
        i = com.google.android.apps.hangouts.R.drawable.cf;
          goto _L14
_L10:
        i = com.google.android.apps.hangouts.R.drawable.cn;
          goto _L14
        i = com.google.android.apps.hangouts.R.drawable.bZ;
          goto _L14
    }

    public int getViewTypeCount()
    {
        return dqc.values().length;
    }

    static 
    {
        hik hik = ebw.d;
        k = TimeUnit.MINUTES.toMicros(15L);
    }
}
