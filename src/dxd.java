// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dxd
{

    public final int a;
    public final int b;
    public final int c;
    public final String d;
    public final int e;
    public final int f;

    dxd(int i, int j, int k, String s, int l, int i1)
    {
        a = i;
        b = j;
        c = k;
        d = s;
        e = l;
        f = i1;
    }

    public boolean a()
    {
        return a != 0 || b == -1 || b == 0;
    }

    public boolean a(int i)
    {
        return a == 0 && b != -1 && b > i;
    }

    public String toString()
    {
        int i = a;
        int j = b;
        int k = c;
        String s = d;
        int l = e;
        int i1 = f;
        return (new StringBuilder(String.valueOf(s).length() + 210)).append("CellState.serviceState: ").append(i).append(", CellState.signalLevelPercent: ").append(j).append(", CellState.phoneType: ").append(k).append(", CellState.networkOperator: ").append(s).append(", CellState.networkType: ").append(l).append(", CellState.systemId: ").append(i1).toString();
    }
}
