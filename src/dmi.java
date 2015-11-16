// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dmi extends Enum
{

    public static final dmi a;
    public static final dmi b;
    public static final dmi c;
    public static final dmi d;
    public static final dmi e;
    private static final dmi h[];
    public final String f;
    public final hpg g;

    private dmi(String s, int i, String s1, String s2)
    {
        super(s, i);
        f = s2;
        g = new hpg(s2, s1);
    }

    public static dmi valueOf(String s)
    {
        return (dmi)Enum.valueOf(dmi, s);
    }

    public static dmi[] values()
    {
        return (dmi[])h.clone();
    }

    static 
    {
        a = new dmi("HANGOUTS_API", 0, "https://www.googleapis.com/chat/v1android/", "debug.conserver.frontend.url");
        b = new dmi("HANGOUTS_UPLOAD_API", 1, "https://www.googleapis.com/upload/chat/v1android/", "debug.conserver.upload.url");
        c = new dmi("MESI_API", 2, "https://www.googleapis.com/hangouts/v1android/", "debug.mesi.frontend.url");
        d = new dmi("PLUSI", 3, "https://www.googleapis.com/plusi/v3/ozInternal/", "debug.plus.frontend.url");
        e = new dmi("GOOGLE_VOICE", 4, "https://www.googleapis.com/voice/v1/", "debug.voice.frotend.url");
        h = (new dmi[] {
            a, b, c, d, e
        });
    }
}
