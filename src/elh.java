// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class elh extends Enum
{

    public static final elh A;
    public static final elh B;
    public static final elh C;
    public static final elh D;
    public static final elh E;
    public static final elh F;
    public static final elh G;
    public static final elh H;
    public static final elh I;
    public static final elh J;
    public static final elh K;
    public static final elh L;
    public static final elh M;
    public static final elh N;
    public static final elh O;
    public static final elh P;
    public static final elh Q;
    public static final elh R;
    public static final elh S;
    public static final elh T;
    public static final elh U;
    public static final elh V;
    private static final elh X[];
    public static final elh a;
    public static final elh b;
    public static final elh c;
    public static final elh d;
    public static final elh e;
    public static final elh f;
    public static final elh g;
    public static final elh h;
    public static final elh i;
    public static final elh j;
    public static final elh k;
    public static final elh l;
    public static final elh m;
    public static final elh n;
    public static final elh o;
    public static final elh p;
    public static final elh q;
    public static final elh r;
    public static final elh s;
    public static final elh t;
    public static final elh u;
    public static final elh v;
    public static final elh w;
    public static final elh x;
    public static final elh y;
    public static final elh z;
    private final String W;

    private elh(String s1, int i1, String s2)
    {
        super(s1, i1);
        W = s2;
    }

    public static elh valueOf(String s1)
    {
        return (elh)Enum.valueOf(elh, s1);
    }

    public static elh[] values()
    {
        return (elh[])X.clone();
    }

    public String a()
    {
        return W;
    }

    static 
    {
        a = new elh("SUCCESS", 0, "Ok");
        b = new elh("BAD_AUTHENTICATION", 1, "BadAuthentication");
        c = new elh("EMPTY_CONSUMER_PKG_OR_SIG", 2, "EmptyConsumerPackageOrSig");
        d = new elh("NEEDS_2F", 3, "InvalidSecondFactor");
        e = new elh("NEEDS_POST_SIGN_IN_FLOW", 4, "PostSignInFlowRequired");
        f = new elh("NOT_VERIFIED", 5, "NotVerified");
        g = new elh("TERMS_NOT_AGREED", 6, "TermsNotAgreed");
        h = new elh("UNKNOWN", 7, "Unknown");
        i = new elh("UNKNOWN_ERROR", 8, "UNKNOWN_ERR");
        j = new elh("ACCOUNT_DELETED", 9, "AccountDeleted");
        k = new elh("ACCOUNT_DISABLED", 10, "AccountDisabled");
        l = new elh("SERVICE_DISABLED", 11, "ServiceDisabled");
        m = new elh("SERVICE_UNAVAILABLE", 12, "ServiceUnavailable");
        n = new elh("CAPTCHA", 13, "CaptchaRequired");
        o = new elh("NETWORK_ERROR", 14, "NetworkError");
        p = new elh("USER_CANCEL", 15, "UserCancel");
        q = new elh("PERMISSION_DENIED", 16, "PermissionDenied");
        r = new elh("DEVICE_MANAGEMENT_REQUIRED", 17, "DeviceManagementRequiredOrSyncDisabled");
        s = new elh("THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED", 18, "ThirdPartyDeviceManagementRequired");
        t = new elh("DM_INTERNAL_ERROR", 19, "DeviceManagementInternalError");
        u = new elh("DM_SYNC_DISABLED", 20, "DeviceManagementSyncDisabled");
        v = new elh("DM_ADMIN_BLOCKED", 21, "DeviceManagementAdminBlocked");
        w = new elh("DM_ADMIN_PENDING_APPROVAL", 22, "DeviceManagementAdminPendingApproval");
        x = new elh("DM_STALE_SYNC_REQUIRED", 23, "DeviceManagementStaleSyncRequired");
        y = new elh("DM_DEACTIVATED", 24, "DeviceManagementDeactivated");
        z = new elh("DM_REQUIRED", 25, "DeviceManagementRequired");
        A = new elh("CLIENT_LOGIN_DISABLED", 26, "ClientLoginDisabled");
        B = new elh("NEED_PERMISSION", 27, "NeedPermission");
        C = new elh("BAD_PASSWORD", 28, "WeakPassword");
        D = new elh("ALREADY_HAS_GMAIL", 29, "ALREADY_HAS_GMAIL");
        E = new elh("BAD_REQUEST", 30, "BadRequest");
        F = new elh("BAD_USERNAME", 31, "BadUsername");
        G = new elh("LOGIN_FAIL", 32, "LoginFail");
        H = new elh("NOT_LOGGED_IN", 33, "NotLoggedIn");
        I = new elh("NO_GMAIL", 34, "NoGmail");
        J = new elh("REQUEST_DENIED", 35, "RequestDenied");
        K = new elh("SERVER_ERROR", 36, "ServerError");
        L = new elh("USERNAME_UNAVAILABLE", 37, "UsernameUnavailable");
        M = new elh("DELETED_GMAIL", 38, "DeletedGmail");
        N = new elh("SOCKET_TIMEOUT", 39, "SocketTimeout");
        O = new elh("EXISTING_USERNAME", 40, "ExistingUsername");
        P = new elh("NEEDS_BROWSER", 41, "NeedsBrowser");
        Q = new elh("GPLUS_OTHER", 42, "GPlusOther");
        R = new elh("GPLUS_NICKNAME", 43, "GPlusNickname");
        S = new elh("GPLUS_INVALID_CHAR", 44, "GPlusInvalidChar");
        T = new elh("GPLUS_INTERSTITIAL", 45, "GPlusInterstitial");
        U = new elh("GPLUS_PROFILE_ERROR", 46, "ProfileUpgradeError");
        V = new elh("INVALID_SCOPE", 47, "INVALID_SCOPE");
        X = (new elh[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s, t, 
            u, v, w, x, y, z, A, B, C, D, 
            E, F, G, H, I, J, K, L, M, N, 
            O, P, Q, R, S, T, U, V
        });
    }
}
