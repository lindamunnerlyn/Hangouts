// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Observable;
import java.util.ArrayList;

public final class za extends Observable
{

    za()
    {
    }

    public void a(int i, int j)
    {
        for (int k = mObservers.size() - 1; k >= 0; k--)
        {
            ((zb)mObservers.get(k)).a(i, j, null);
        }

    }

    public boolean a()
    {
        return !mObservers.isEmpty();
    }

    public void b(int i, int j)
    {
        for (int k = mObservers.size() - 1; k >= 0; k--)
        {
            ((zb)mObservers.get(k)).a(i, j);
        }

    }

    public void c(int i, int j)
    {
        for (int k = mObservers.size() - 1; k >= 0; k--)
        {
            ((zb)mObservers.get(k)).b(i, j);
        }

    }
}
