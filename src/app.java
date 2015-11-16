// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


interface app
{

    public static final String a[] = {
        "_id", "phone_id", "full_name", "profile_photo_url"
    };
    public static final String b = s;
    public static final String c = (new StringBuilder(String.valueOf(s).length() + 7 + String.valueOf(s1).length())).append(s).append(" AND ").append(s1).append("=?").toString();

    
    {
        String s = String.valueOf("participant_type=");
        int i = cgf.d.ordinal();
        s = (new StringBuilder(String.valueOf(s).length() + 11)).append(s).append(i).toString();
        String s1 = String.valueOf("conversation_id");
    }
}
