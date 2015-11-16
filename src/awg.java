// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.AbsListView;
import android.widget.ListView;
import com.google.android.apps.hangouts.views.MessageListItemView;
import com.google.android.apps.hangouts.views.ParticipantsGalleryView;
import java.util.Iterator;
import java.util.List;

final class awg
    implements android.widget.AbsListView.OnScrollListener
{

    boolean a;
    boolean b;
    final ave c;

    awg(ave ave1)
    {
        c = ave1;
        super();
    }

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
        if (!g.a(ave.an(c), "babel_log_scroll_error_impressions", true) || a || b) goto _L2; else goto _L1
_L1:
        int i1;
        Object obj;
        int l;
        long l1;
        boolean flag;
        if (j > 0 && i + j < k)
        {
            l = 1;
        } else
        {
            l = 0;
        }
        obj = abslistview.getChildAt(abslistview.getChildCount() - 1);
        if (obj != null && ((View) (obj)).getBottom() > abslistview.getBottom())
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (l == 0) goto _L4; else goto _L3
_L3:
        g.a(ave.h(c), 2758);
        ebw.e("Conv", "message list loaded without bottom message showing");
_L6:
        if (l != 0 || i1 != 0)
        {
            b = true;
            if (g.a(ave.ao(c), "babel_attempt_scroll_error_autofix", true))
            {
                g.a(new awh(this), 250L);
            }
        }
_L2:
        if (ave.W())
        {
            obj = String.valueOf(this);
            flag = ave.ar(c);
            l = ave.as(c);
            l1 = ave.at(c);
            ebw.b("Conv", (new StringBuilder(String.valueOf(obj).length() + 144)).append(((String) (obj))).append(" onScroll   mInitialLoadFinished: ").append(flag).append("  mMessagesLimit: ").append(l).append("  firstVisible: ").append(i).append("  mFirstLocalEventTimestamp: ").append(l1).toString());
        }
        if (g.a(ave.au(c), "babel_extra_log_scrolling", false))
        {
            Object obj1 = new Exception();
            StackTraceElement astacktraceelement[] = ((Throwable) (obj1)).getStackTrace();
            if (astacktraceelement[1].getClassName().equals(android/widget/AbsListView.getName()) && astacktraceelement[1].getMethodName().equals("invokeOnItemScrollListener") && astacktraceelement[2].getClassName().equals(android/widget/AbsListView.getName()) && astacktraceelement[2].getMethodName().equals("trackMotionScroll"))
            {
                ebw.b("Babel_Scroll", "Scroll from hand");
            } else
            if (astacktraceelement[1].getClassName().equals(android/widget/AbsListView.getName()) && astacktraceelement[1].getMethodName().equals("invokeOnItemScrollListener") && astacktraceelement[2].getClassName().equals(android/widget/ListView.getName()) && astacktraceelement[2].getMethodName().equals("layoutChildren"))
            {
                ebw.b("Babel_Scroll", "Autoscroll from layout");
            } else
            if (astacktraceelement[1].getClassName().equals(android/widget/AbsListView.getName()) && astacktraceelement[1].getMethodName().equals("invokeOnItemScrollListener") && astacktraceelement[2].getClassName().equals(android/widget/AbsListView.getName()) && astacktraceelement[2].getMethodName().equals("setOnScrollListener"))
            {
                ebw.b("Babel_Scroll", "Initial scroll state");
            } else
            {
                ebw.a("Babel_Scroll", "Unknown scroll provenance", ((Throwable) (obj1)));
            }
        }
        ave.b(c, i);
        obj1 = abslistview.getChildAt(abslistview.getChildCount() - 1);
        if (obj1 != null)
        {
            l = ((View) (obj1)).getBottom();
            i1 = abslistview.getHeight();
            boolean flag1;
            boolean flag2;
            if (i + j == k)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag1 && !ave.E(c).c() && !ave.i(c))
            {
                ave.E(c).a(l - i1);
            } else
            {
                ave.E(c).a();
            }
            abslistview = (aqd)ave.av(c);
            if (!flag1)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            abslistview.b(flag2);
            if (g.a(ave.aw(c), "babel_extra_log_scrolling", false))
            {
                i = ((ListView)ave.ax(c)).getBottom();
                ebw.c("Babel_Scroll", (new StringBuilder(81)).append("onScroll isAtBottom:").append(flag1).append(" lastItemBottom:").append(l).append(" listView bottom: ").append(i).toString());
            }
            if (flag1 && l == ((ListView)ave.ay(c)).getBottom() && ave.az(c))
            {
                ave.aA(c);
                if (g.a(ave.aB(c), "babel_disable_events_on_auto_scroll", true))
                {
                    ebw.e("Babel_Scroll", "force update after autoScroll.");
                    onScrollStateChanged(null, 0);
                }
            }
        }
        return;
_L4:
        if (i1 != 0)
        {
            g.a(ave.h(c), 2759);
            ebw.e("Conv", "message list loaded with bottom message not aligned");
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
        a = true;
        if (g.a(ave.aC(c), "babel_extra_log_scrolling", false))
        {
            boolean flag = ave.az(c);
            ebw.e("Babel_Scroll", (new StringBuilder(64)).append("onScrollStateChanged scrollState:").append(i).append(" autoScrolling:").append(flag).toString());
        }
        if (!ave.az(c) || !g.a(ave.aD(c), "babel_disable_events_on_auto_scroll", true)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        switch (i)
        {
        default:
            return;

        case 0: // '\0'
            ((aqd)ave.aF(c)).c(false);
            abslistview = c.e.iterator();
            while (abslistview.hasNext()) 
            {
                ((MessageListItemView)abslistview.next()).t();
            }
            break;

        case 1: // '\001'
        case 2: // '\002'
            ((aqd)ave.aE(c)).c(true);
            ave.O(c);
            ave.am(c).b();
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }
}
