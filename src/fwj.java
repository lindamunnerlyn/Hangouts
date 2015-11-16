// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.wearable.internal.CapabilityInfoParcelable;
import com.google.android.gms.wearable.internal.NodeParcelable;

public final class fwj
    implements android.os.Parcelable.Creator
{

    public fwj()
    {
    }

    public static void a(CapabilityInfoParcelable capabilityinfoparcelable, Parcel parcel)
    {
        int i = g.p(parcel, 20293);
        g.b(parcel, 1, capabilityinfoparcelable.a);
        g.a(parcel, 2, capabilityinfoparcelable.b());
        g.c(parcel, 3, capabilityinfoparcelable.c());
        g.q(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        java.util.ArrayList arraylist = null;
        int j = g.a(parcel);
        int i = 0;
        String s = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    g.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = g.e(parcel, k);
                    break;

                case 2: // '\002'
                    s = g.i(parcel, k);
                    break;

                case 3: // '\003'
                    arraylist = g.c(parcel, k, NodeParcelable.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new af((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new CapabilityInfoParcelable(i, s, arraylist);
            }
        } while (true);
    }

    public Object[] newArray(int i)
    {
        return new CapabilityInfoParcelable[i];
    }
}
