// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class hmi
{

    private final hmj a;
    private final hmk b;

    public String toString()
    {
        String s = getClass().getName().replaceAll("\\$[0-9]+", "\\$");
        int j = s.lastIndexOf('$');
        int i = j;
        if (j == -1)
        {
            i = s.lastIndexOf('.');
        }
        return (new hoc(new hmm(s.substring(i + 1)))).a("header", a).a("payload", b).toString();
    }
}
