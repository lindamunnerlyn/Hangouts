// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.ListAdapter;

public final class td
    implements android.content.DialogInterface.OnClickListener, android.content.DialogInterface.OnDismissListener, android.content.DialogInterface.OnKeyListener, tq
{

    sy a;
    private ta b;
    private qp c;
    private tq d;

    public td(ta ta1)
    {
        b = ta1;
    }

    public void a()
    {
        Object obj = b;
        qq qq1 = new qq(((ta) (obj)).e());
        a = new sy(qq1.a(), g.by);
        a.a(this);
        b.a(a);
        qq1.a(a.a(), this);
        View view = ((ta) (obj)).q();
        if (view != null)
        {
            qq1.a(view);
        } else
        {
            qq1.a(((ta) (obj)).p()).a(((ta) (obj)).o());
        }
        qq1.a(this);
        c = qq1.b();
        c.setOnDismissListener(this);
        obj = c.getWindow().getAttributes();
        obj.type = 1003;
        obj.flags = ((android.view.WindowManager.LayoutParams) (obj)).flags | 0x20000;
        c.show();
    }

    public void a(ta ta1, boolean flag)
    {
        if ((flag || ta1 == b) && c != null)
        {
            c.dismiss();
        }
        if (d != null)
        {
            d.a(ta1, flag);
        }
    }

    public boolean a(ta ta1)
    {
        if (d != null)
        {
            return d.a(ta1);
        } else
        {
            return false;
        }
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        b.a((te)a.a().getItem(i), 0);
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        a.a(b, true);
    }

    public boolean onKey(DialogInterface dialoginterface, int i, KeyEvent keyevent)
    {
        if (i == 82 || i == 4)
        {
            if (keyevent.getAction() == 0 && keyevent.getRepeatCount() == 0)
            {
                dialoginterface = c.getWindow();
                if (dialoginterface != null)
                {
                    dialoginterface = dialoginterface.getDecorView();
                    if (dialoginterface != null)
                    {
                        dialoginterface = dialoginterface.getKeyDispatcherState();
                        if (dialoginterface != null)
                        {
                            dialoginterface.startTracking(keyevent, this);
                            return true;
                        }
                    }
                }
            } else
            if (keyevent.getAction() == 1 && !keyevent.isCanceled())
            {
                Object obj = c.getWindow();
                if (obj != null)
                {
                    obj = ((Window) (obj)).getDecorView();
                    if (obj != null)
                    {
                        obj = ((View) (obj)).getKeyDispatcherState();
                        if (obj != null && ((android.view.KeyEvent.DispatcherState) (obj)).isTracking(keyevent))
                        {
                            b.a(true);
                            dialoginterface.dismiss();
                            return true;
                        }
                    }
                }
            }
        }
        return b.performShortcut(i, keyevent, 0);
    }
}
