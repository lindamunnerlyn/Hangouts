// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.PopupWindow;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

final class ur
    implements android.view.ViewTreeObserver.OnScrollChangedListener
{

    final Field a;
    final PopupWindow b;
    final android.view.ViewTreeObserver.OnScrollChangedListener c;

    ur(Field field, PopupWindow popupwindow, android.view.ViewTreeObserver.OnScrollChangedListener onscrollchangedlistener)
    {
        a = field;
        b = popupwindow;
        c = onscrollchangedlistener;
        super();
    }

    public void onScrollChanged()
    {
        WeakReference weakreference = (WeakReference)a.get(b);
        if (weakreference == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        if (weakreference.get() == null)
        {
            return;
        }
        try
        {
            c.onScrollChanged();
            return;
        }
        catch (IllegalAccessException illegalaccessexception) { }
    }
}
