// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ListAdapter;
import horizontallistview.HorizontalListView;

public final class lgb extends android.view.GestureDetector.SimpleOnGestureListener
{

    final HorizontalListView a;

    public lgb(HorizontalListView horizontallistview)
    {
        a = horizontallistview;
        super();
    }

    private static boolean a(MotionEvent motionevent, View view)
    {
        Rect rect = new Rect();
        int ai[] = new int[2];
        view.getLocationOnScreen(ai);
        int i = ai[0];
        int j = view.getWidth();
        int k = ai[1];
        rect.set(i, k, j + i, view.getHeight() + k);
        return rect.contains((int)motionevent.getRawX(), (int)motionevent.getRawY());
    }

    public boolean onDown(MotionEvent motionevent)
    {
        return a.d();
    }

    public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        return a.a(f);
    }

    public void onLongPress(MotionEvent motionevent)
    {
        int j = a.getChildCount();
        int i = 0;
        do
        {
label0:
            {
                if (i < j)
                {
                    View view = a.getChildAt(i);
                    if (!a(motionevent, view))
                    {
                        break label0;
                    }
                    if (a.j != null)
                    {
                        a.j.onItemLongClick(a, view, a.c + 1 + i, a.b.getItemId(i + (a.c + 1)));
                    }
                }
                return;
            }
            i++;
        } while (true);
    }

    public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        synchronized (a)
        {
            motionevent1 = a;
            motionevent1.e = ((HorizontalListView) (motionevent1)).e + (int)f;
        }
        a.requestLayout();
        return true;
        motionevent1;
        motionevent;
        JVM INSTR monitorexit ;
        throw motionevent1;
    }

    public boolean onSingleTapConfirmed(MotionEvent motionevent)
    {
        int i = 0;
        do
        {
label0:
            {
                if (i < a.getChildCount())
                {
                    View view = a.getChildAt(i);
                    if (!a(motionevent, view))
                    {
                        break label0;
                    }
                    if (a.i != null)
                    {
                        a.i.onItemClick(a, view, a.c + 1 + i, a.b.getItemId(a.c + 1 + i));
                    }
                    if (a.h != null)
                    {
                        a.h.onItemSelected(a, view, a.c + 1 + i, a.b.getItemId(a.c + 1 + i));
                    }
                }
                return true;
            }
            i++;
        } while (true);
    }
}
