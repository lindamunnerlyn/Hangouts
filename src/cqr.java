// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.ActionMode;

public final class cqr
{

    final cqt a;
    ActionMode b;
    private final android.widget.AbsListView.MultiChoiceModeListener c = new cqs(this);

    public cqr(cqt cqt)
    {
        a = cqt;
    }

    public android.widget.AbsListView.MultiChoiceModeListener a()
    {
        return c;
    }

    public void a(CharSequence charsequence)
    {
label0:
        {
            if (b != null)
            {
                if (charsequence == null)
                {
                    break label0;
                }
                charsequence = new SpannableString(charsequence);
                charsequence.setSpan(new ForegroundColorSpan(-1), 0, charsequence.length(), 33);
                b.setTitle(charsequence);
            }
            return;
        }
        b.setTitle(null);
    }

    public void b()
    {
        if (b != null)
        {
            b.invalidate();
        }
    }

    public void c()
    {
        if (b != null)
        {
            b.finish();
        }
    }
}
