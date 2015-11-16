// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.ViewTreeObserver;

final class xc
    implements android.widget.PopupWindow.OnDismissListener
{

    final android.view.ViewTreeObserver.OnGlobalLayoutListener a;
    final wz b;

    xc(wz wz1, android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener)
    {
        b = wz1;
        a = ongloballayoutlistener;
        super();
    }

    public void onDismiss()
    {
        ViewTreeObserver viewtreeobserver = b.a.getViewTreeObserver();
        if (viewtreeobserver != null)
        {
            viewtreeobserver.removeGlobalOnLayoutListener(a);
        }
    }
}
