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

final class awv
    implements android.widget.AbsListView.OnScrollListener
{

    boolean a;
    boolean b;
    final avv c;

    awv(avv avv1)
    {
        c = avv1;
        super();
    }

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
        if (!g.a(avv.ao(c), "babel_log_scroll_error_impressions", true) || a || b) goto _L2; else goto _L1
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
        g.a(avv.h(c), 2758);
        eev.e("Conv", "message list loaded without bottom message showing");
_L6:
        if (l != 0 || i1 != 0)
        {
            b = true;
            if (g.a(avv.ap(c), "babel_attempt_scroll_error_autofix", true))
            {
                g.a(new aww(this), 250L);
            }
        }
_L2:
        if (avv.W())
        {
            obj = String.valueOf(this);
            flag = avv.as(c);
            l = avv.at(c);
            l1 = avv.au(c);
            eev.b("Conv", (new StringBuilder(String.valueOf(obj).length() + 144)).append(((String) (obj))).append(" onScroll   mInitialLoadFinished: ").append(flag).append("  mMessagesLimit: ").append(l).append("  firstVisible: ").append(i).append("  mFirstLocalEventTimestamp: ").append(l1).toString());
        }
        if (g.a(avv.av(c), "babel_extra_log_scrolling", false))
        {
            Object obj1 = new Exception();
            StackTraceElement astacktraceelement[] = ((Throwable) (obj1)).getStackTrace();
            if (astacktraceelement[1].getClassName().equals(android/widget/AbsListView.getName()) && astacktraceelement[1].getMethodName().equals("invokeOnItemScrollListener") && astacktraceelement[2].getClassName().equals(android/widget/AbsListView.getName()) && astacktraceelement[2].getMethodName().equals("trackMotionScroll"))
            {
                eev.b("Babel_Scroll", "Scroll from hand");
            } else
            if (astacktraceelement[1].getClassName().equals(android/widget/AbsListView.getName()) && astacktraceelement[1].getMethodName().equals("invokeOnItemScrollListener") && astacktraceelement[2].getClassName().equals(android/widget/ListView.getName()) && astacktraceelement[2].getMethodName().equals("layoutChildren"))
            {
                eev.b("Babel_Scroll", "Autoscroll from layout");
            } else
            if (astacktraceelement[1].getClassName().equals(android/widget/AbsListView.getName()) && astacktraceelement[1].getMethodName().equals("invokeOnItemScrollListener") && astacktraceelement[2].getClassName().equals(android/widget/AbsListView.getName()) && astacktraceelement[2].getMethodName().equals("setOnScrollListener"))
            {
                eev.b("Babel_Scroll", "Initial scroll state");
            } else
            {
                eev.a("Babel_Scroll", "Unknown scroll provenance", ((Throwable) (obj1)));
            }
        }
        avv.a(c, i, ((ListView)abslistview).getHeaderViewsCount());
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
            if (flag1 && !avv.D(c).c() && !avv.i(c))
            {
                avv.D(c).a(l - i1);
            } else
            {
                avv.D(c).a();
            }
            abslistview = (aqu)avv.aw(c);
            if (!flag1)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            abslistview.b(flag2);
            if (g.a(avv.ax(c), "babel_extra_log_scrolling", false))
            {
                i = ((ListView)avv.ay(c)).getBottom();
                eev.c("Babel_Scroll", (new StringBuilder(81)).append("onScroll isAtBottom:").append(flag1).append(" lastItemBottom:").append(l).append(" listView bottom: ").append(i).toString());
            }
            if (flag1 && l == ((ListView)avv.az(c)).getBottom() && avv.aA(c))
            {
                avv.aB(c);
                if (g.a(avv.aC(c), "babel_disable_events_on_auto_scroll", true))
                {
                    eev.e("Babel_Scroll", "force update after autoScroll.");
                    onScrollStateChanged(null, 0);
                }
            }
        }
        return;
_L4:
        if (i1 != 0)
        {
            g.a(avv.h(c), 2759);
            eev.e("Conv", "message list loaded with bottom message not aligned");
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
        a = true;
        if (g.a(avv.aD(c), "babel_extra_log_scrolling", false))
        {
            boolean flag = avv.aA(c);
            eev.e("Babel_Scroll", (new StringBuilder(64)).append("onScrollStateChanged scrollState:").append(i).append(" autoScrolling:").append(flag).toString());
        }
        if (!avv.aA(c) || !g.a(avv.aE(c), "babel_disable_events_on_auto_scroll", true)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        switch (i)
        {
        default:
            return;

        case 0: // '\0'
            ((aqu)avv.aG(c)).c(false);
            abslistview = c.d.iterator();
            while (abslistview.hasNext()) 
            {
                ((MessageListItemView)abslistview.next()).t();
            }
            break;

        case 1: // '\001'
        case 2: // '\002'
            ((aqu)avv.aF(c)).c(true);
            avv.O(c);
            avv.an(c).b();
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }
}
