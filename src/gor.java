// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class gor
    implements fsn, him, hin, hio
{

    List a;
    private boolean b;

    public gor(hjm hjm1)
    {
        a = new ArrayList();
        hjm1.a(this);
    }

    public void a()
    {
        b = true;
    }

    public boolean a(KeyEvent keyevent)
    {
label0:
        {
            if (!b || keyevent.getKeyCode() != 4 || keyevent.getAction() != 1)
            {
                break label0;
            }
            keyevent = a.iterator();
            do
            {
                if (!keyevent.hasNext())
                {
                    break label0;
                }
            } while (!((a)keyevent.next()).o());
            return true;
        }
        return false;
    }

    public void b()
    {
        b = false;
    }
}
