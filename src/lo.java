// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.ViewParent;

class lo
{

    lo()
    {
    }

    public void a(ViewParent viewparent, View view)
    {
        if (viewparent instanceof jn)
        {
            ((jn)viewparent).onStopNestedScroll(view);
        }
    }

    public void a(ViewParent viewparent, View view, int i, int j, int k, int l)
    {
        if (viewparent instanceof jn)
        {
            ((jn)viewparent).onNestedScroll(view, i, j, k, l);
        }
    }

    public void a(ViewParent viewparent, View view, int i, int j, int ai[])
    {
        if (viewparent instanceof jn)
        {
            ((jn)viewparent).onNestedPreScroll(view, i, j, ai);
        }
    }

    public boolean a(ViewParent viewparent, View view, float f, float f1)
    {
        if (viewparent instanceof jn)
        {
            return ((jn)viewparent).onNestedPreFling(view, f, f1);
        } else
        {
            return false;
        }
    }

    public boolean a(ViewParent viewparent, View view, float f, float f1, boolean flag)
    {
        if (viewparent instanceof jn)
        {
            return ((jn)viewparent).onNestedFling(view, f, f1, flag);
        } else
        {
            return false;
        }
    }

    public boolean a(ViewParent viewparent, View view, View view1, int i)
    {
        if (viewparent instanceof jn)
        {
            return ((jn)viewparent).onStartNestedScroll(view, view1, i);
        } else
        {
            return false;
        }
    }

    public void b(ViewParent viewparent, View view, View view1, int i)
    {
        if (viewparent instanceof jn)
        {
            ((jn)viewparent).onNestedScrollAccepted(view, view1, i);
        }
    }
}
